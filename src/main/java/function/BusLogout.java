package function;

/**
 * create by 1311230692@qq.com on 2018/9/7 14:47
 * 对登出报文进行解析
 **/
public class BusLogout {
    public static void main(String[] args) {
        String s = "232304FE4C413935423733425847314C43303830300100081107180D1A020008CC";
        System.out.println(busLogin(s));
    }

    /**
     * 处理登出数据
     * 返回数据格式为："车架号，登出时间，登出流水号"
     * */
    public static String busLogin(String s) {
//        ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<>();
//        ObjectMapper objectMapper = new ObjectMapper();
        String validStr = s.substring(8);
        char[] data = Function.change(validStr);
        System.out.println();
        String logout_time = "";
        StringBuilder vin = new StringBuilder();
//        StringBuilder iccid = new StringBuilder();
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


        logout_time =  s1 + "-" + s2 + "-" + s3 + " " + s4 + ":" + s5 + ":" + s6;

        id = String.valueOf(data[26] << 8 | data[27]);

//        for (int i = 28; i < 48; i++) {
//            iccid.append(data[i]);
//        }
        return vin.toString() + "," + logout_time + "," + String.valueOf(id);
    }
}
