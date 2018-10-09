package test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * create by 1311230692@qq.com on 2018/10/9 16:24
 * 普通测试类
 **/
public class TestFunction extends BaseJunit{

    @Test
    public  void test() {
        HashMap<Integer, Object> map = new HashMap<>();
//        for (int i = 0; i < 10000000; i++) {
//            map.put(i , i);
//        }

        System.out.println(map);

        for (Map.Entry<Integer, Object> entry: map.entrySet()) {
            System.out.println("第：" + entry.getKey() + "次的值为：" + entry.getValue());
        }
    }

}
