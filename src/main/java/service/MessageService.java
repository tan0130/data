package service;

import entity.Phone;

/**
 * create by 1311230692@qq.com on 2018/10/9 09:22
 * 发送短信验证码业务逻辑层
 **/
public interface MessageService {
    /**
     * 查找手机号是否被注册
     * @param phone 要查询的手机号
     * */
    boolean selectPhone(String phone);

    /**
     * 注册手机号
     * @param phone 要注册的手机号
     * */
    void add(Phone phone);
}
