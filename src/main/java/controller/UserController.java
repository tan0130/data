package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
     * 添加日志记录，写入数据库
     * */
    private static Logger logger = LogManager.getLogger(UserController.class);

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
                ThreadContext.put("userId",String.valueOf(id));
                ThreadContext.put("userName",userName);
                logger.info("用户登录成功");
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

    /**
     * 修改密码
     * */
    @RequestMapping(value = "/register")
    @ResponseBody
    public String registerUser(User user,HttpServletRequest request) throws Exception{
        //System.out.println("添加用户信息");
        Map<String, Object> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            userService.registerUser(user);
            Thread.currentThread().sleep(3000);
//            int id = userService.getUserByUserName(user.getUser_name()).getUser_id();

            int id = (int)request.getSession().getAttribute("logId");

            map.put("result","success");
            map.put("id",id);
            ThreadContext.put("userId",String.valueOf(id));
            ThreadContext.put("userName",user.getUser_name());
            logger.info("用户注册成功");
            System.out.print(mapper.writeValueAsString(map));
            return  mapper.writeValueAsString(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        map.put("result","fail");
        return mapper.writeValueAsString(map);
    }


    /**
     * 修改密码
     * @param oldPassword 用户旧密码
     * @param newPassword 用户新密码
     * @param request 用户获取 session 对象
     * */
    @RequestMapping(value = "/updatePassword")
    @ResponseBody
    public String updatePassword(User user ,String oldPassword, String newPassword, HttpServletRequest request) {
        System.out.println("修改密码");
        int id = 0;
        try {
            if (null != request.getSession().getAttribute("loginId")) {
                id = (Integer)request.getSession().getAttribute("loginId");
                System.out.println("id:" + id);
                if (null != userService.getUserByIdAndPwd(id, oldPassword)) {
                    user.setUser_id(id);
                    user.setUser_pwd(newPassword);
                    System.out.println(user);
                    userService.updatePassword(user);
                    ThreadContext.put("userId",String.valueOf(id));
                    ThreadContext.put("userName",userService.getUserById1(id).getUser_name());
                    logger.info("用户密码修改成功");
                    return "success";
                } else {
                    return "wrongPassword";
                }
            } else {

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "fail";
    }


}
