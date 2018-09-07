package function;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.concurrent.ConcurrentHashMap;

/**
 * create by 1311230692@qq.com on 2018/9/7 13:28
 * 对登录报文进行解析
 **/
public class BusLogin {
    public static void main(String[] args) {
//        String s = "23 23 01 FE 4C 41 39 35 42 37 33 42 58 47 31 4C 43 30 38 30 30 01 00 1E 11 07 18 0D 0C 0F 00 07 38 39 38 36 30 33 31 36 34 33 32 30 32 32 39 30 30 32 36 30 01 00 C9";
        String s = "232301FE4C413935423733425847314C433038303001001E1107180D0C0F000738393836303331363433323032323930303236300100C9";
        System.out.println(busLogin(s));

//        String str = busLogin(s);
//        System.out.println(str.terminal_in_code);

    }

    /**
     * 处理登录数据
     * 返回数据格式为："车架号，时间，登入流水号，iccid"
     * */
    public static String busLogin(String s) {
//        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
//        ObjectMapper objectMapper = new ObjectMapper();
        String validStr = s.substring(8);
        char[] data = Function.change(validStr);
        String login_time = "";
        StringBuilder vin = new StringBuilder();
        StringBuilder iccid = new StringBuilder();
        String id = "";
        String s1 = "",s2 = "",s3 = "",s4 = "",s5 = "",s6 = "";
        // 车架号
        for (int i = 0; i < 17; i++) {
            vin.append(data[i]);
        }

        int n1 = data[20];
        int n2 = data[21];
        int n3 = data[22];
        int n4 = data[23];
        int n5 = data[24];
        int n6 = data[25];

        s1 =  "20" + n1;

        if (n2 < 10) {
            s2 = "0" + n2;
        } else {
            s2 = String.valueOf(n2);
        }
        if (n3 < 10) {
            s3 = "0" + n3;
        } else {
            s3 = String.valueOf(n3);
        }
        if (n4 < 10) {
            s4 = "0" + n4;
        } else {
            s4 = String.valueOf(n4);
        }
        if (n5 < 10) {
            s5 = "0" + n5;
        } else {
            s5 = String.valueOf(n5);
        }
        if (n6 < 10) {
            s6 = "0" + n6;
        } else {
            s6 = String.valueOf(n6);
        }


        login_time =  s1 + "-" + s2 + "-" + s3 + " " + s4 + ":" + s5 + ":" + s6;

        id = String.valueOf(data[26] << 8 | data[27]);

        for (int i = 28; i < 48; i++) {
            iccid.append(data[i]);
        }
        return vin.toString() + "," + login_time + "," + String.valueOf(id) + "," + iccid.toString();
    }
}
