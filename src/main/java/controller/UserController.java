package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * create by 1311230692@qq.com on 2018/8/31 13:35
 * 用户操作控制层
 **/
@Controller
@RequestMapping(value="/user")
public class UserController {

    // 注入 service
    @Resource(name = "UserService")
    private UserService userService;

    /**
     * 查询所有用户信息
     * @return 返回 json 数据
     * */
    @RequestMapping(value = "/getUserById", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getAllUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 允许跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("P3P", "CP=CAO PSA OUR");
        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            response.addHeader("Access-Control-Allow-Methods", "POST,GET,TRACE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
            response.addHeader("Access-Control-Max-Age", "120");
        }
        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
        List<User> userList = userService.getAllUser();
        map.put("total", userList.size());
        map.put("rows", userList);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(map);
    }

    /**
     * 根据 id 查询用户信息
     * @param id 需要查询的 id
     * @return json 返回 json 数据
     * */
    @RequestMapping(value = "/getUserByIdList", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getUserById(int id, HttpServletRequest request, HttpServletResponse response) throws Exception{
        // 允许跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("P3P", "CP=CAO PSA OUR");
        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            response.addHeader("Access-Control-Allow-Methods", "POST,GET,TRACE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
            response.addHeader("Access-Control-Max-Age", "120");
        }
        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
        List<User> userList = userService.getUserById(id);
        map.put("total", userList.size());
        map.put("rows", userList);
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(map);
    }

    /**
     * 根据 id 查询 id 是否存在
     * @param id 需要查询的用户 id
     * @return result 返回查询结果
     * */
    @RequestMapping(value = "/getUserById")
    @ResponseBody
    public String getUserById1(int id, HttpServletRequest request, HttpServletResponse response) {
        // 允许跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("P3P", "CP=CAO PSA OUR");
        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            response.addHeader("Access-Control-Allow-Methods", "POST,GET,TRACE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
            response.addHeader("Access-Control-Max-Age", "120");
        }
        try {
            if (null == userService.getUserById1(id)) {
                return "false";
            } else {
                return "true";
            }
        } catch (Exception e) {
            return "error";
        }

    }

    /**
     * 验证用户密码是否正确
     * @param id 需要验证的 id
     * @param password 需要验证的密码
     * @return result 返回校验结果
     * */
    @RequestMapping(value = "/getUserByIdAndPwd")
    @ResponseBody
    public String getUser(int id, String password, HttpServletRequest request, HttpServletResponse response) {
        // 允许跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("P3P", "CP=CAO PSA OUR");
        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            response.addHeader("Access-Control-Allow-Methods", "POST,GET,TRACE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
            response.addHeader("Access-Control-Max-Age", "120");
        }
        try {
            if (null == userService.getUserByIdAndPwd(id, password)) {
                return "true";
            } else {
                return "false";
            }
        } catch (Exception e) {
            return "error";
        }
    }

    /**
     * 校验用户是否存在，密码是否正确
     * @param id 传入 id
     * @param password 传入密码
     * @return result 返回校验结果
     * */
    @RequestMapping(value = "/login")
    @ResponseBody
    public String check(int id, String password, HttpServletRequest request, HttpServletResponse response) throws Exception{
        ConcurrentHashMap<String,String> map = new ConcurrentHashMap<>();
        ObjectMapper objectMapper = new ObjectMapper();
        // 允许跨域访问
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("P3P", "CP=CAO PSA OUR");
        if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
            response.addHeader("Access-Control-Allow-Methods", "POST,GET,TRACE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
            response.addHeader("Access-Control-Max-Age", "120");
        }
        try {
            if (null == userService.getUserById1(id)) {
                map.put("result","wringId");
                return objectMapper.writeValueAsString(map);
            } else if (null == userService.getUserByIdAndPwd(id, password)) {
                map.put("result","wrongPassword");
                return objectMapper.writeValueAsString(map);
            } else {
                map.put("result","true");
//                System.out.println("true");
                String userName = userService.getUserById1(id).getUser_name();
                request.getSession().setAttribute("loginId", id);
                request.getSession().setAttribute("loginName", userName);
                return objectMapper.writeValueAsString(map);
            }
        } catch (Exception e) {
           // return "error";
        }
        map.put("result","false");
        return objectMapper.writeValueAsString(map);
    }

    /**
     * 获取登录名
     * */
    @RequestMapping(value = "/name", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String getLoginName(HttpServletRequest request) {
        return (String)request.getSession().getAttribute("loginName");
    }
}
