package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import service.VehicleService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.swing.*;
import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by 1311230692@qq.com on 2018/9/4 10:03
 * 车辆信息控制层操作
 **/
@Controller
@RequestMapping("/vehicle")
public class VehicleController {

    // 注入 VehicleService
    @Resource
    private VehicleService vehicleService;

    /**
     * 地图监控，查询所有车辆位置及状态
     * */
    @RequestMapping(value = "/allMap",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String allMap() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Location> locationList = vehicleService.getAllMapLocation();
            return mapper.writeValueAsString(locationList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 地图监控，根据车架号查询所有车辆位置及状态
     * @param vin 要查询的车架号
     * */
    @RequestMapping(value = "/vinMap",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String allMap(String vin) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            List<Location> locationList = vehicleService.getAllMapLocationByVin(vin);
            return mapper.writeValueAsString(locationList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 远程控制发送指令
     * */
    @RequestMapping(value = "/sendMsg")
    @ResponseBody
    public String sendMsg(String vin, String command) throws Exception{
//        System.out.println(vin + "..." + command);
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        Thread.sleep(5000);
        concurrentHashMap.put("result", "success");
        return objectMapper.writeValueAsString(concurrentHashMap);
    }

    /**
     * 报文查询
     * */
    @RequestMapping(value = "/searchCode",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String searchCode(String vin, String start_time, String end_time, int page, int limit) {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        int totalCount = 0;
        try {
            totalCount = vehicleService.getCountByVin(vin);
            List<History> vehicleList = vehicleService.getVehicleHistoryCode(vin,start_time,end_time,limit*(page - 1),limit);
            concurrentHashMap.put("status", 200);
            concurrentHashMap.put("hint", "");
            concurrentHashMap.put("total", totalCount);
            concurrentHashMap.put("rows", vehicleList);
            return mapper.writeValueAsString(concurrentHashMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 更新整车数据
     * */
    @RequestMapping(value = "/vehicleData",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getVehicleData(String vin) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Vehicle> vehicleList = vehicleService.getVehicleByVin(vin);
            return mapper.writeValueAsString(vehicleList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 更新电机数据
     * */
    @RequestMapping(value = "/motorData",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getMotorData(String vin) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Motor> motorList = vehicleService.getMotorByVin(vin);
            return mapper.writeValueAsString(motorList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 更新位置数据
     * */
    @RequestMapping(value = "/locationData",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getLocationData(String vin) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Location> locationList = vehicleService.getLocationByVin(vin);
            return mapper.writeValueAsString(locationList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 更新极值数据
     * */
    @RequestMapping(value = "/extremeData",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getExtremeData(String vin) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Extreme> extremeList = vehicleService.getExtremeByVin(vin);
            return mapper.writeValueAsString(extremeList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 更新报警数据
     * */
    @RequestMapping(value = "/alertData",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getAlertData(String vin) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<Alert> alertList = vehicleService.getAlertByVin(vin);
            return mapper.writeValueAsString(alertList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 更新状态数据
     * */
    @RequestMapping(value = "/stateData",produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getStateData(String vin) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            List<State> stateList = vehicleService.getStateByVin(vin);
            return mapper.writeValueAsString(stateList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 上传文件
     * */
    @RequestMapping(value = "/upload")
    @ResponseBody
    public String upload(HttpServletRequest request, MultipartFile file) throws Exception {
        String json = null;
        Map<String, String> map = new HashMap<>();
        System.out.println("upload_file:" + file);
        ObjectMapper mapper = new ObjectMapper();
        if(!file.isEmpty()) {
            //上传文件路径
            String path = request.getServletContext().getRealPath("/file/");
            System.out.println(path);
            //上传文件名
            String filename = file.getOriginalFilename();
            File filepath = new File(path,filename);
            //判断路径是否存在，如果不存在就创建一个
            if (!filepath.getParentFile().exists()) {
                filepath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目标文件当中
            file.transferTo(new File(path + File.separator + filename));
            //System.out.print("文件上传成功");

            map.put("result", "success");
            json = mapper.writeValueAsString(map);
            // System.out.println("返回json 数据为：" + json);
            return json;
        } else {
            map.put("result","fail");
            json = mapper.writeValueAsString(map);
            return json;
        }
    }

    /**
     * 保存历史记录
     * */
    @RequestMapping(value = "/saveMessage")
    @ResponseBody
    public String saveHistoryText(String history_Text) {
        // 获取当前系统时间
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
        String current_time = df.format(new Date());
        try {
            JFileChooser jfileChooser = new JFileChooser();
            jfileChooser.setMultiSelectionEnabled(false); // 不支持多选
            jfileChooser.setFileSelectionMode(JFileChooser.SAVE_DIALOG | JFileChooser.DIRECTORIES_ONLY);
            jfileChooser.setDialogTitle("选择目标文件夹");
            if (jfileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                File file = jfileChooser.getSelectedFile();
                String filePath = file.getPath();
                PrintWriter printWriter = new PrintWriter(filePath + "\\" + current_time + "history_text.txt");
                printWriter.println(history_Text);
                printWriter.close();
            } else {
                return "fail";
            }

            return "success";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "false";

    }
}
