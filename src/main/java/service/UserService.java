package service;

import entity.User;

import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/8/31 13:11
 * 用户操作业务逻辑层
 **/
public interface UserService {
    /**
     * 查询所有用户信息
     * */
    List<User> getAllUser();

    /**
     * 根据 id 查询用户信息
     * @param id
     * */
    List<User> getUserById(int id);

    /**
     * 根据 id 查询判断 id 是否存在
     * @param id
     * */
    User getUserById1(int id);

    /**
     * 根据 id 和 密码判断用户是否存在
     * @param id
     * @param password
     * */
    User getUserByIdAndPwd(int id, String password);
}
