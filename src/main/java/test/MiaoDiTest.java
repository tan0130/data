package test;

import org.junit.Test;
import util.IndustrySMS;

import java.io.IOException;

/**
 * create by 1311230692@qq.com on 2018/10/9 13:37
 * 秒嘀科技发送验证码测试类
 **/
public class MiaoDiTest extends BaseJunit{
    @Test
    public void test() throws IOException {
        IndustrySMS.execute();
    }
}
