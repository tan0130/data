package test;

import entity.User;
import org.junit.Test;
import service.UserService;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/8/31 14:22
 **/
public class UserTest extends BaseJunit {
    @Resource(name = "UserService")
    private UserService userService;

    @Test
    public void test() {
        List<User> userList = userService.getAllUser();
        System.out.println("所有用户信息为：" + userList);

        List<User> userList1 = userService.getUserById(1);
        System.out.println("查询用户信息：" + userList1);

        System.out.println("查询用户是否存在：" + userService.getUserByIdAndPwd(1,"123456"));
    }
}
