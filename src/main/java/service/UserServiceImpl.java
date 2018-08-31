package service;

import dao.UserDAO;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/8/31 13:13
 * 用户操作业务逻辑层实现
 **/
@Service("UserService")
public class UserServiceImpl implements UserService{

    // 注入 UserDAO
    @Resource
    private UserDAO userDAO;

    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUser();
    }

    @Override
    public List<User> getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public User getUserById1(int id) {
        return userDAO.getUserById1(id);
    }

    @Override
    public User getUserByIdAndPwd(int id, String password) {
        return userDAO.getUserByIdAndPwd(id, password);
    }
}
