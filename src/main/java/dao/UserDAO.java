package dao;

import entity.User;

import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/8/31 13:04
 * 用户操作 DAO 接口
 **/
public interface UserDAO {
    /**
     * 查询所有用户信息
     * */
    List<User> getAllUser();

    /**
     * 根据 id 查询用户信息
     * @param id 传入需要查询的 id
     * */
    List<User> getUserById(int id);

    /**
     * 根据 id 查询判断 id 是否存在
     * @param id 传入需要查询的 id
     * */
    User getUserById1(int id);

    /**
     * 根据 id 和 密码判断用户是否存在
     * @param id 传入需要查询的 id
     * @param password 传入需要验证的密码
     * */
    User getUserByIdAndPwd(int id, String password);

    /**
     * 注册用户
     * @param user 传入需要注册的信息
     * */
    void registerUser(User user);

    /**
     * 修改密码
     * @param user 传入需要修改的信息
     * */
    void updatePassword(User user);

    /**
     * 根据 user_name 查询用户信息
     * @param user_name 传入需要查询的 id
     * */
    User getUserByUserName(String user_name);

}
