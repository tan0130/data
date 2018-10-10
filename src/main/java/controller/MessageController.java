package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.Phone;
import org.apache.commons.httpclient.HttpException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MessageService;
import util.SendMsgUtil;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

/**
 * create by 1311230692@qq.com on 2018/10/9 09:32
 * 发送短信校验码控制层实现
 *
 * 短信
 *
 *
 **/
@Controller
@RequestMapping("/message")
public class MessageController {

    @Resource(name = "MessageService")
    private MessageService messageService;


    /**
     * 跳转 check 页面
     * */
    @RequestMapping(value = "/check")
    public String check() {
        return "page/check";
    }


    /**
     * 发送校验码
     * @param phone 目标手机号
     * */
    @RequestMapping(value = "/send", method = RequestMethod.GET)
    @ResponseBody
    public String send(String phone, HttpServletRequest request) throws HttpException, Exception {
        HashMap<String, String> map = SendMsgUtil.getMessageStatus(phone);
        HashMap<String, String> hashMap = new HashMap<>(); // 用于存放返回结果

        ObjectMapper objectMapper = new ObjectMapper();

        String result = map.get("result");
        HttpSession session = request.getSession(); // 设置 session
        session.setMaxInactiveInterval(60 * 1); // 缓存设置 1 分钟内有效
        if (result.trim().equals("1")) { // 标志位 1：成功
            String code = map.get("code");
            System.out.println("验证码为：" + code);
            session.setAttribute("code",code); // 将收到的验证码放入 session 中
            hashMap.put("result","success");
        } else { // 标志位 0：失败
            hashMap.put("result","fail");
        }
        return objectMapper.writeValueAsString(hashMap);
    }

    /**
     * 比对校验码
     * */
    @RequestMapping(value = "/checkCode", method = RequestMethod.POST)
    @ResponseBody
    public String checkCode(String code, Phone phone, HttpServletRequest request) throws Exception{
        HashMap<String, String> map = new HashMap<>();
        ObjectMapper objectMapper = new ObjectMapper(); // json 转换函数
        HttpSession session = request.getSession(); // 设置 session
        String sessionCode = (String)session.getAttribute("code");

        if ((code).equals(sessionCode)) { // 和缓存比对验证码是否相同
            map.put("result", "success");
        } else {
            map.put("result", "fail");
        }
        return objectMapper.writeValueAsString(map);
    }
}
