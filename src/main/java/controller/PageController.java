package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * create by 1311230692@qq.com on 2018/8/31 16:14
 * 页面跳转
 **/
@Controller
@RequestMapping(value="/page")
public class PageController {

    /**
     * 跳转 login 登录页面
     * */
    @RequestMapping(value="/login")
    public void toLoginPage(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.getRequestDispatcher("/login.html").forward(request, response);
    }

    /**
     * 跳转 admin 用户操作页面
     * */
    @RequestMapping(value="/admin")
    public String toAdminPage() {
        return "admin/admin";
    }

    /**
     * 跳转 index 首页
     * */
    @RequestMapping(value="/index")
    public String toIndexPage() {
        return "index/index";
    }

    /**
     * 跳转 map 地图监控页面
     * */
    @RequestMapping(value="/map")
    public String toMapPage() {
        return "page/map";
    }

    /**
     * 跳转 vehicle 整车数据页面
     * */
    @RequestMapping(value="/vehicle")
    public String toVehiclePage() {
        return "page/vehicle";
    }

    /**
     * 跳转 motor 电机数据页面
     * */
    @RequestMapping(value="/motor")
    public String toMotorPage() {
        return "page/motor";
    }

    /**
     * 跳转 location 位置信息页面
     * */
    @RequestMapping(value="/location")
    public String toLocationPage() {
        return "page/location";
    }

    /**
     * 跳转 extreme 极值数据页面
     * */
    @RequestMapping(value="/extreme")
    public String toExtremePage() {
        return "page/extreme";
    }

    /**
     * 跳转 alert 报警数据页面
     * */
    @RequestMapping(value="/alert")
    public String toAlertPage() {
        return "page/alert";
    }

    /**
     * 跳转 state 状态数据页面
     * */
    @RequestMapping(value="/state")
    public String toStatePage() {
        return "page/state";
    }

    /**
     * 跳转 temperature 温度数据页面
     * */
    @RequestMapping(value="/temperature")
    public String toTemperaturePage() {
        return "page/temperature";
    }

    /**
     * 跳转 voltage 电压数据页面
     * */
    @RequestMapping(value="/voltage")
    public String toVoltagePage() {
        return "page/voltage";
    }

    /**
     * 跳转 control 远程控制页面
     * */
    @RequestMapping(value="/control")
    public String toControlPage() {
        return "page/control";
    }

    /**
     * 跳转 update 远程控制页面
     * */
    @RequestMapping(value="/update")
    public String toUpdatePage() {
        return "page/update";
    }

    /**
     * 跳转 search 历史报文查询页面
     * */
    @RequestMapping(value="/search")
    public String toSearchPage() {
        return "page/search";
    }

    /**
     * 跳转 about 关于我们页面
     * */
    @RequestMapping(value="/about")
    public String toAboutPage() {
        return "page/about";
    }

    /**
     * 跳转 password 棉麻修改页面
     * */
    @RequestMapping(value="/password")
    public String toPasswordPage() {
        return "page/password";
    }
}
