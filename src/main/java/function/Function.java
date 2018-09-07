package function;

/**
 * create by 1311230692@qq.com on 2018/9/7 13:38
 * 工具类
 **/
public class Function {
    public static void main(String[] args) {
        String s = "23 23 01 FE 4C 41 39 35 42 37 33 42 58 47 31 4C 43 30 38 30 30 01 00 1E 11 07 18 0D 0C 0F 00 07 38 39 38 36 30 33 31 36 34 33 32 30 32 32 39 30 30 32 36 30 01 00 C9";
        System.out.println(handlerStr(s));
        System.out.println(checkData(handlerStr(s)));
    }

    /**
     * 校验报文
     *
     * */
    public static String checkData(String s) {
        String s0 = "";
        int value = 0;
        s0 = s.substring(4);
        char[] data = change(s0);
        for (int i = 0; i < data.length - 1; i++) {
            value = value ^ data[i];
        }
        if(value == data[data.length - 1]) {
            s = "数据有效";
        } else {
            s = "数据无效";
        }
        return s;
    }

    /**
     * 字符串转字符数组
     * */
    public static char[] change(String s) {
        char[] result = new char[s.length()/2]; // 定义数组
        for (int i = 0; i < result.length; i++)
            result[i] = (char)(Integer.parseInt(s.substring(2*i, 2*i + 2),16 & 0xFF));
        return result;
    }

    /**
     * 字符串去除空格
     * */
    public static String handlerStr(String s) {
        String[] ss;
//        String s1 = "";
        StringBuilder stringBuilder = new StringBuilder();
        ss = s.split(" ");
        for (int i = 0; i < ss.length; i++) {
           stringBuilder.append(ss[i]);
        }
        return stringBuilder.toString();
    }
}
