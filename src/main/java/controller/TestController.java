package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/10/9 16:45
 * 测试类控制层
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    /**
     * 测试
     * */
    @RequestMapping(value = "/num")
    @ResponseBody
    public static String getNum() throws Exception{
        HashMap<String, String> map = new HashMap<>();
        List<Integer> list = printArr();
        ObjectMapper objectMapper = new ObjectMapper();
        map.put("result",String.valueOf(list));
        System.out.println("map:" + map);
        return objectMapper.writeValueAsString(map);
    }

    public static List<Integer> printArr() {
        int j = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8000000; i++) {
            list.add(i);
        }
        j++;
        System.out.println("触发第：" + j + "次");
        return list;
    }
}
