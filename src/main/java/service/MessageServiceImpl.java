package service;

import entity.Phone;
import org.springframework.stereotype.Service;

/**
 * create by 1311230692@qq.com on 2018/10/9 09:28
 * 发送验证码短信业务逻辑层实现
 **/
@Service("MessageService")
public class MessageServiceImpl implements MessageService {
    @Override
    public boolean selectPhone(String phone) {
        boolean flag = false;
        return flag;
    }

    @Override
    public void add(Phone phone) {

    }
}
