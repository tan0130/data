package function;

/**
 * create by 1311230692@qq.com on 2018/9/7 15:03
 * 处理实时信息和补发信息
 **/
public class TimeInformation {
    private static String s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,
            s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22;
    private static String vinStr,sv,timeStr,st,vehicleStr,svehicle,motorStr,sm,locationStr,sl,
            extremeStr,se,alertStr,sa,voltageStr,svol,temperatureStr,stemp;
    private static char[] data;
    private static int n,n1,n2,n3,n4,n5,n6,n7,n8,n9,volCount;
    public static void main(String[] args) {

    }

    /**
     * 获取车架号
     * @param s 传入车架号的那段字符串，对传入的整条报文需要截取字符串
     * @return vin 车架号
     * */
    public static String getVin(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] data = Function.change(s);
        for (int i = 0; i < data.length; i++) {
            stringBuilder.append(data[i]);
        }
        return stringBuilder.toString();
    }

    /**
     * 获取报文时间
     * @param s 传入字符串
     * 返回数据格式为："车辆状态，充电状态，运行模式，车速，累计里程，总电压，总电流，SOC，DCDC状态，档位，电阻，加速踏板行程值，制动踏板行程值"
     * */
    public static String getTime(String s) {
        char[] data = Function.change(s);
        System.out.println();
        String s1 = "",s2 = "",s3 = "",s4 = "",s5 = "",s6 = "";
        int n1 = data[0];
        int n2 = data[1];
        int n3 = data[2];
        int n4 = data[3];
        int n5 = data[4];
        int n6 = data[5];

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
        return s1 + "-" + s2 + "-" + s3 + " " + s4 + ":" + s5 + ":" + s6;
    }

    /**
     * 获取 01 整车信息
     * @param s 传入需要处理的字符串
     * @return result 返回获取的信息
     * */
    public static String vehicleData(String s) {
        data = Function.change(s);
        for(int i = 0;i < 13;i++) {
            switch(i) {
                case 0:
                    switch(data[1]) {
                        case 0x01:
                            s3 = "车辆启动";
                            break;
                        case 0x02:
                            s3 = "车辆熄火";
                            break;
                        case 0x03:
                            s3 = "其它状态";
                            break;
                        case 0xFE:
                            s3 = "状态异常";
                            break;
                        case 0xFF:
                            s3 = "数据无效";
                            break;
                        default:
                            break;
                    };
                    break;
                case 1:
                    switch(data[2]) {
                        case 0x01:
                            s4 = "停车充电";
                            break;
                        case 0x02:
                            s4 = "行驶充电";
                            break;
                        case 0x03:
                            s4 = "未充电";
                            break;
                        case 0x04:
                            s4 = "充电完成";
                            break;
                        case 0xFE:
                            s4 = "状态异常";
                            break;
                        case 0xFF:
                            s4 = "数据无效";
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    switch(data[3]) {
                        case 0x01:
                            s5 = "纯电";
                            break;
                        case 0x02:
                            s5 = "混动";
                            break;
                        case 0x03:
                            s5 = "燃油";
                            break;
                        case 0xFE:
                            s5 = "状态异常";
                            break;
                        case 0xFF:
                            s5 = "数据无效";
                            break;
                        default:
                            break;
                    };
                    break;
                case 3:
                    switch(data[4] << 8 | data[5]) {
                        case 0xFFFE:
                            s6 = "车速异常";
                            break;
                        case 0xFFFF:
                            s6 = "数据无效";
                            break;
                        default:
                            s6 = "" + (data[4] << 8 | data[5]) / 10.0;
                            break;
                    }
                    break;
                case 4:
                    switch(data[6] << 24 | data[7] << 16 | data[8] << 8 | data[9]) {
                        case 0xFFFFFFFE:
                            s7 = "里程异常";
                            break;
                        case 0xFFFFFFFF:
                            s7 = "数据无效";
                            break;
                        default:
                            double n1 = data[6] << 24 | data[7] << 16 | data[8] << 8 | data[9];
                            s7 = "" + n1 / 10.0;
                            break;
                    }
                    break;
                case 5:
                    switch(data[10] << 8 | data[11]) {
                        case 0xFFFE:
                            s8 = "总电压异常";
                            break;
                        case 0xFFFF:
                            s8 = "数据无效";
                            break;
                        default:
                            s8 = "" + (data[10] << 8 | data[11]) / 10.0;
                            break;
                    }
                    break;
                case 6:
                    switch(data[12] << 8 | data[13]) {
                        case 0xFFFE:
                            s9 = "总电流异常";
                        case 0xFFFF:
                            s9 = "数据无效";
                        default:
                            s9 = "" + ((data[12] << 8 | data[13]) / 10.0 - 1000);
                            break;
                    }
                    break;
                case 7:
                    switch(data[14]) {
                        case 0xFE:
                            s10 = "SOC异常";
                            break;
                        case 0xFF:
                            s10 = "数据无效";
                            break;
                        default:
                            s10 = "" + n1;
                            break;
                    }
                    break;
                case 8:
                    switch(data[15]) {
                        case 0x01:
                            s11 = "工作";
                            break;
                        case 0x02:
                            s11 = "断开";
                            break;
                        case 0xFE:
                            s11 = "状态异常";
                            break;
                        case 0xFF:
                            s11 = "数据无效";
                            break;
                        default:
                            break;
                    }
                    break;
                case 9:
                    switch(data[16]) {
                        case 0x00:
                        case 0x10:
                        case 0x20:
                        case 0x30:
                            s12 = "空挡";
                            break;
                        case 0x01:
                        case 0x11:
                        case 0x21:
                        case 0x31:
                            s12 = "1档";
                            break;
                        case 0x02:
                        case 0x12:
                        case 0x22:
                        case 0x32:
                            s12 = "2档";
                            break;
                        case 0x03:
                        case 0x13:
                        case 0x23:
                        case 0x33:
                            s12 = "3档";
                            break;
                        case 0x04:
                        case 0x14:
                        case 0x24:
                        case 0x34:
                            s12 = "4档";
                            break;
                        case 0x05:
                        case 0x15:
                        case 0x25:
                        case 0x35:
                            s12 = "5档";
                            break;
                        case 0x06:
                        case 0x16:
                        case 0x26:
                        case 0x36:
                            s12 = "6档";
                            break;
                        case 0x0D:
                        case 0x1D:
                        case 0x2D:
                        case 0x3D:
                            s12 = "R档";
                            break;
                        case 0x0E:
                        case 0x1E:
                        case 0x2E:
                        case 0x3E:
                            s12 = "D档";
                            break;
                        case 0x0F:
                        case 0x1F:
                        case 0x2F:
                        case 0x3F:
                            s12 = "P档";
                            break;
                        case 0xFF:
                            s12 = "数据无效";
                            break;
                        default:
                            s12 = "数据异常";
                            break;
                    };
                    break;
                case 10:
                    switch(data[17] << 8 | data[18]) {
                        case 0xFFFE:
                            s13 = "数据异常";
                            break;
                        case 0xFFFF:
                            s13 = "数据无效";
                            break;
                        default:
                            s13 = "" + (data[17] << 8 | data[18]);
                            break;
                    };
                    break;
                case 11:
                    switch(data[19]) {
                        case 0xFE:
                            s14 = "数据异常";
                            break;
                        case 0xFF:
                            s14 = "数据无效";
                            break;
                        default:
                            s14 = "" + n2;
                            break;
                    };
                    break;
                case 12:
                    switch(data[20]) {
                        case 0xFE:
                            s15 = "数据异常";
                            break;
                        case 0xFF:
                            s15 = "数据无效";
                            break;
                        default:
                            s15 = "" + n3;
                    };
                    break;
            }

        }
        return s1 + "," + s2 + "," + s3 + "," + s4 + "," + s5 + "," + s6 + "," + s7 + "," + s8 + "," + s9 + "," + s10 + "," +
                s11 + "," + s12 + "," + s13 + "," + s14 + "," + s15;
    }

    /**
     * 获取电机数据
     * @param s
     * 返回数据格式："驱动电机个数，序号，状态，控制器温度，电机转速，电机转矩，电机温度，控制器输入电压，直流母线电流"
     * */
    public static String motorData(String s) {
        String s13 = "";
        n = Integer.parseInt(s.substring(2, 4),16); // 驱动电机个数
        s1 = "" + n;
        for(int i = 1; i <= n;i++) {
            s3 = s.substring(4+24*(i-1), 28+24*(i-1));
            data = Function.change(s3);
            for(int j = 1;j <= 8;j++) {
                switch(j) {
                    case 1:
                        n2 = data[0];
                        s5 = "" + n2;
                        break;
                    case 2:
                        switch(data[1]) {
                            case 0x01:
                                s6 = "耗电";
                                break;
                            case 0x02:
                                s6 = "发电";
                                break;
                            case 0x03:
                                s6 = "关闭";
                                break;
                            case 0x04:
                                s6 = "准备";
                                break;
                            case 0xFE:
                                s6 = "数据异常";
                                break;
                            case 0xFF:
                                s6 = "数据无效";
                                break;
                            default:
                                break;
                        };
                        break;
                    case 3:
                        switch(data[2]) {
                            case 0xFE:
                                s7 = "数据异常";
                                break;
                            case 0xFF:
                                s7 = "数据无效";
                                break;
                            default:
                                n1 = data[2];
                                s7 = "" + (n1 - 40);
                                break;
                        }
                        break;
                    case 4:
                        switch(data[3] << 8 | data[4]) {
                            case 0xFFFE:
                                s8 = "数据异常";
                                break;
                            case 0xFFFF:
                                s8 = "数据无效";
                                break;
                            default:
                                n1 = data[3] << 8 | data[4];
                                s8 = "" + (n1 - 20000);
                                break;
                        }
                        break;
                    case 5:
                        switch(data[5] << 8 | data[6]) {
                            case 0xFFFE:
                                s9 = "数据异常";
                                break;
                            case 0xFFFF:
                                s9 = "数据无效";
                                break;
                            default:
                                double n1 = data[5] << 8 | data[6];
                                s9 = "" + (n1 - 20000);
                                break;
                        }
                        break;
                    case 6:
                        switch(data[7]) {
                            case 0xFE:
                                s10 = "数据异常";
                                break;
                            case 0xFF:
                                s10 = "数据无效";
                                break;
                            default:
                                n1 = data[7];
                                s10 = "" + (n1 - 40);
                                break;
                        };
                        break;
                    case 7:
                        switch(data[8] << 8 | data[9]) {
                            case 0xFFFE:
                                s11 = "数据异常";
                                break;
                            case 0xFFFF:
                                s11 = "数据无效";
                                break;
                            default:
                                double n1 = data[8] << 8 | data[9];
                                s11 = "" + n1 / 10;
                                break;
                        };
                        break;
                    case 8:
                        switch(data[10] << 8 | data[11]) {
                            case 0xFFFE:
                                s12 = "数据异常";
                                break;
                            case 0xFFFF:
                                s12 = "数据无效";
                                break;
                            default:
                                n1 = data[10] << 8 | data[11];
                                s12 = "" + (n1 / 10 - 1000);
                                break;
                        };
                        break;
                    default:
                        break;
                }
            }
            s13 += s5 + "," + s6 + "," + s7 + "," + s8 + "," +
                    s9 + "," + s10 + "," + s11 + "," + s12;
        }
        s14 = s1 + "," + "," + s13;
        return s14;
    }

    /**
     * 获取位置信息
     * @param s
     * 返回数据格式："定位状态，经度，纬度"
     * */
    public static String locationData(String s) {
        data = Function.change(s);

        // 经度解析
        String lngStr = s.substring(4, 12);
        Long longitude = Long.parseLong(lngStr,16);
        float lng = longitude / 1000000;

        // 纬度解析
        String latStr = s.substring(12, 20);
        Long latitude = Long.parseLong(latStr,16);
        float lat = latitude / 1000000;

        // 获取经度信息
        switch(data[1] & 0xFF) {
            case 0x00:
            case 0x02:
            case 0x04:
            case 0x06:
                s2 = "有效";
                s3 = "" + lng;
                s4 = "" + lat;
                break;
            case 0x01:
            case 0x03:
            case 0x05:
            case 0x07:
                s2 = "无效";
                s3 = "" + lng;
                s4 = "" + lat;
                break;
            default:
                break;
        }
        s = s2 + "," + s3 + "," + s4;
        return s;
    }

    /**
     * 获取极值数据
     * @param s
     * 返回数据格式："最高电压子系统号，单体序号，最高值，最低电压子系统，单体序号，最低值，最高温度子系统号，单体序号，最大值，最低单体子系统号，序号，最小智
     * */
    public static String extremeData(String s) {
        data = Function.change(s);
        for(int i = 1;i <= 12;i++) {
            switch(i) {
                case 1:
                    switch(data[1]) {
                        case 0xFE:
                            s2 = "数据异常";
                            break;
                        case 0xFF:
                            s2 = "数据无效";
                            break;
                        default:
                            n = data[1];
                            s2 = "" + n;
                            break;
                    }
                    break;
                case 2:
                    switch(data[2]) {
                        case 0xFE:
                            s3 = "数据异常";
                            break;
                        case 0xFF:
                            s3 = "数据无效";
                            break;
                        default:
                            n = data[2];
                            s3 = "" + n;
                            break;
                    }
                    break;
                case 3:
                    switch(data[3] << 8 | data[4]) {
                        case 0xFFFE:
                            s4 = "数据异常";
                            break;
                        case 0xFFFF:
                            s4 = "数据无效";
                            break;
                        default:
                            double n1 = data[3] << 8 | data[4];
                            s4 = "" + n1 / 1000;
                    }
                    break;
                case 4:
                    switch(data[5]) {
                        case 0xFE:
                            s5 = "数据异常";
                            break;
                        case 0xFF:
                            s5 = "数据无效";
                            break;
                        default:
                            n2 = data[5];
                            s5 = "" + n2;
                            break;
                    }
                    break;
                case 5:
                    switch(data[6]) {
                        case 0xFE:
                            s6 = "数据异常";
                            break;
                        case 0xFF:
                            s6 = "数据无效";
                            break;
                        default:
                            n3 = data[6];
                            s6 = "" + n3;
                            break;
                    }
                    break;
                case 6:
                    switch(data[7] << 8 | data[8]) {
                        case 0xFFFE:
                            s7 = "数据异常";
                            break;
                        case 0xFFFF:
                            s7 = "数据无效";
                            break;
                        default:
                            double n4 = data[7] << 8 | data[8];
                            s7 = "" + n4 / 1000;
                            break;
                    }
                    break;
                case 7:
                    switch(data[9]) {
                        case 0xFE:
                            s8 = "数据异常";
                            break;
                        case 0xFF:
                            s8 = "数据无效";
                            break;
                        default:
                            n5 = data[9];
                            s8 = "" + n5;
                            break;
                    }
                    break;
                case 8:
                    switch(data[10]) {
                        case 0xFE:
                            s9 = "数据异常";
                            break;
                        case 0xFF:
                            s9 = "数据无效";
                            break;
                        default:
                            n6 = data[10];
                            s9 = "" + n6;
                            break;
                    }
                    break;
                case 9:
                    switch(data[11]) {
                        case 0xFE:
                            s10 = "数据异常";
                            break;
                        case 0xFF:
                            s10 = "数据无效";
                            break;
                        default:
                            n7 = data[11];
                            s10 = "" + (n7 - 40);
                            break;
                    }
                    break;
                case 10:
                    switch(data[12]) {
                        case 0xFE:
                            s11 = "数据异常";
                            break;
                        case 0xFF:
                            s11 = "数据无效";
                            break;
                        default:
                            n7 = data[12];
                            s11 = "" + n7;
                            break;
                    }
                    break;
                case 11:
                    switch(data[13]) {
                        case 0xFE:
                            s12 = "数据异常";
                            break;
                        case 0xFF:
                            s12 = "数据无效";
                            break;
                        default:
                            n8 = data[13];
                            s12 = "" + n8;
                            break;
                    }
                    break;
                case 12:
                    switch(data[14]) {
                        case 0xFE:
                            s13 = "数据异常";
                            break;
                        case 0xFF:
                            s13 = "数据无效";
                            break;
                        default:
                            n9 = data[14];
                            s13 = "" + (n9 - 40);
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
        s = s2 + "," + s3 + "," + s4 + "," + s5 + "," + s6 + "," + s7 + "," +
                s8 + "," + s9 + "," + s10 + "," + s11 + "," + s12 + "," + s13;
        return s;
    }

    /**
     * 获取报警数据
     * @param s
     * 返回数据格式："状态，，，，，，，，，，，，，，，，，，，，，，，"
     * */
    public static String alertData(String s) {
        data = Function.change(s);
        for(int i = 1;i <= 2;i++) {
            switch(i) {
                case 1:
                    switch(data[1]) {
                        case 0x00:
                            s2 = "无故障";
                            break;
                        case 0x01:
                            s2 = "1级故障";
                            break;
                        case 0x02:
                            s2 = "2级故障";
                            break;
                        case 0x03:
                            s2 = "3级故障";
                            break;
                        case 0xFE:
                            s2 = "数据异常";
                            break;
                        default:
                            s2 = "数据无效";
                            break;
                    }
                    break;
                case 2:
//                    s3 = "报警类型：";
                    for (int j = 1; j <= 19; j++) {
                        switch(j) {
                            case 1:
                                switch(data[3] & 0x04) {
                                    case 0x04:
                                        s4 = "报警";
                                        break;
                                    case 0xFE:
                                        s4 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s4 = "数据无效";
                                        break;
                                    default:
                                        s4 = "正常";
                                        break;
                                }
                                break;
                            case 2:
                                switch(data[3] & 0x02) {
                                    case 0x02:
                                        s5 = "报警";
                                        break;
                                    case 0xFE:
                                        s5 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s5 = "数据无效";
                                        break;
                                    default:
                                        s5 = "正常";
                                        break;
                                }
                                break;
                            case 3:
                                switch(data[3] & 0x01) {
                                    case 0x01:
                                        s6 = "报警";
                                        break;
                                    case 0xFE:
                                        s6 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s6 = "数据无效";
                                        break;
                                    default:
                                        s6 = "正常";
                                        break;
                                }
                                break;
                            case 4:
                                switch(data[4] & 0x80) {
                                    case 0x80:
                                        s7 = "报警";
                                        break;
                                    case 0xFE:
                                        s7 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s7 = "数据无效";
                                        break;
                                    default:
                                        s7 = "正常";
                                        break;
                                }
                                break;
                            case 5:
                                switch(data[4] & 0x40) {
                                    case 0x40:
                                        s8 = "报警";
                                        break;
                                    case 0xFE:
                                        s8 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s8 = "数据无效";
                                        break;
                                    default:
                                        s8 = "正常";
                                        break;
                                }
                                break;
                            case 6:
                                switch(data[4] & 0x20) {
                                    case 0x20:
                                        s9 = "报警";
                                        break;
                                    case 0xFE:
                                        s9 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s9 = "数据无效";
                                        break;
                                    default:
                                        s9 = "正常";
                                        break;
                                }
                                break;
                            case 7:
                                switch(data[4] & 0x10) {
                                    case 0x10:
                                        s10 = "报警";
                                        break;
                                    case 0xFE:
                                        s10 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s10 = "数据无效";
                                        break;
                                    default:
                                        s10 = "正常";
                                        break;
                                }
                                break;
                            case 8:
                                switch(data[4] & 0x08) {
                                    case 0x08:
                                        s11 = "报警";
                                        break;
                                    case 0xFE:
                                        s11 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s11 = "数据无效";
                                        break;
                                    default:
                                        s11 = "正常";
                                        break;
                                }
                                break;
                            case 9:
                                switch(data[4] & 0x04) {
                                    case 0x04:
                                        s12 = "报警";
                                        break;
                                    case 0xFE:
                                        s12 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s12 = "数据无效";
                                        break;
                                    default:
                                        s12 = "正常";
                                        break;
                                }
                                break;
                            case 10:
                                switch(data[4] & 0x02) {
                                    case 0x02:
                                        s13 = "报警";
                                        break;
                                    case 0xFE:
                                        s13 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s13 = "数据无效";
                                        break;
                                    default:
                                        s13 = "正常";
                                        break;
                                }
                                break;
                            case 11:
                                switch(data[4] & 0x01) {
                                    case 0x01:
                                        s14 = "报警";
                                        break;
                                    case 0xFE:
                                        s14 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s14 = "数据无效";
                                        break;
                                    default:
                                        s14 = "正常";
                                        break;
                                }
                                break;
                            case 12:
                                switch(data[5] & 0x80) {
                                    case 0x80:
                                        s15 = "报警";
                                        break;
                                    case 0xFE:
                                        s15 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s15 = "数据无效";
                                        break;
                                    default:
                                        s15 = "正常";
                                        break;
                                }
                                break;
                            case 13:
                                switch(data[5] & 0x40) {
                                    case 0x40:
                                        s16 = "报警";
                                        break;
                                    case 0xFE:
                                        s16 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s16 = "数据无效";
                                        break;
                                    default:
                                        s16 = "正常";
                                        break;
                                }
                                break;
                            case 14:
                                switch(data[5] & 0x20) {
                                    case 0x20:
                                        s17 = "报警";
                                        break;
                                    case 0xFE:
                                        s17 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s17 = "数据无效";
                                        break;
                                    default:
                                        s17 = "正常";
                                        break;
                                }
                                break;
                            case 15:
                                switch(data[5] & 0x10) {
                                    case 0x10:
                                        s18 = "报警";
                                        break;
                                    case 0xFE:
                                        s18 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s18 = "数据无效";
                                        break;
                                    default:
                                        s18 = "正常";
                                        break;
                                }
                                break;
                            case 16:
                                switch(data[5] & 0x08) {
                                    case 0x08:
                                        s19 = "报警";
                                        break;
                                    case 0xFE:
                                        s19 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s19 = "数据无效";
                                        break;
                                    default:
                                        s19 = "正常";
                                        break;
                                }
                                break;
                            case 17:
                                switch(data[5] & 0x04) {
                                    case 0x04:
                                        s20 = "报警";
                                        break;
                                    case 0xFE:
                                        s20 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s20 = "数据无效";
                                        break;
                                    default:
                                        s20 = "正常";
                                        break;
                                }
                                break;
                            case 18:
                                switch(data[5] & 0x02) {
                                    case 0x02:
                                        s21 = "报警";
                                        break;
                                    case 0xFE:
                                        s21 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s21 = "数据无效";
                                        break;
                                    default:
                                        s21 = "正常";
                                        break;
                                }
                                break;
                            case 19:
                                switch(data[5] & 0x01) {
                                    case 0x01:
                                        s22 = "报警";
                                        break;
                                    case 0xFE:
                                        s22 = "数据异常";
                                        break;
                                    case 0xFF:
                                        s22 = "数据无效";
                                        break;
                                    default:
                                        s22 = "正常";
                                        break;
                                }
                                break;
                        }

                    }
                    break;
            }
        }
        s = s2 + "," + s4 + "," + s5 + "," + s6 + "," + s7 + "," +
                s8 + "," + s9 + "," + s10 + "," + s11 + "," + s12 + "," + s13 + "," + s14 + "," +
                s15 + "," + s16 + "," + s17 + "," + s18 + "," + s19 + "," + s20 + "," + s21 + "," + s22;
        return s;
    }

    /**
     * 获取电压数据
     * @param s
     * 返回数据格式："子系统个数，子系统号，电压，电流，单体总数，起始序号，本帧单体电池总数，单体电池电压"
     * */
    public static String voltageData(String s) {
        String s10 = "";
//        s1 = "08单体电压数据：";
        data = Function.change(s);
        // 可充电储能子系统个数
        s2 = "" + 1;
        // 各子系统电压数据
        for(int i = 1;i <= 6;i++) {
            switch(i) {
                case 1:
                    n1 = data[2];
                    s3 = "" + n1;
                    break;
                case 2:
                    double n2 = data[3] << 8 | data[4];
                    s4 = "" + n2 / 10;
                    break;
                case 3:
                    double n3 = data[5] << 8 | data[6];
                    s5 = "" + (n3 / 10 - 1000);
                    break;
                case 4:
                    n4 = data[7] << 8 | data[8];
                    s6 = "" + n4;
                    break;
                case 5:
                    n5 = data[9] << 8 | data[10];
                    s7 = "" + n5;
                    break;
                case 6:
                    n6 = data[11];
                    s8 = "" + n6;
                    for(int j = 12;j <= n6 + 11;) {
                        double n7 = data[j] << 8 | data[j+1];
//                        s9 = "";
                        s10 += (n7 / 1000 + ",");
                        j += 2;
                    }
                    break;
                default:
                    break;

            }
        }
        s = s2 + "," + s3 + "," + s4 + "," + s5 + "," + s6 + "," +
                s7 + "," + s8 + "," + s10;
        return s;
    }

    /**
     * 获取温度数据
     * @param s
     * 返回数据格式："子系统数，子系统号，温度探针个数，单体温度值"
     * */
    public static String temperatureData(String s) {
        String s10 = "";
//        s1 = "09温度探针数据：";
        s2 = "" + 1;
//        s3 = "可充电储能装置子系统温度信息列表：";
        s4 = s.substring(6, 10);
        switch(s4) {
            case "FFFE":
                s5 = "数据异常";
                break;
            case "FFFF":
                s5 = "数据无效";
                break;
            default:
                s6 = s.substring(4);
                data = Function.change(s6);
                n1 = data[0];
                s7 = "" + n1;
                n2 = data[1] << 8 | data[2];
                s8 = "" + n2;
                s9 = "";
                for(int j = 3; j <= (s6.substring(6).length() + 3) / 2; j++) {
                    n3 = data[j];
                    s10 += (n3 - 40) + ",";
                }
                s = s1 + "\r\n" + s2 + "\r\n" + s3 + "\r\n" + s7 + "\r\n" + s8 + "\r\n" + s9 + s10;
                break;
        }
        return s;
    }

    /**
     * 分割数据段
     * @param s
     * 返回数据格式："车架号，报文时间，整车数据，电机数据，位置数据，极值数据，报警数据，电压数据，温度数据"
     * */
    public static String splitData(String s) {
        vinStr = s.substring(8,42);
        timeStr = s.substring(48,60);
        vehicleStr = s.substring(60,102);
        timeStr =
        s1 = vehicleStr.substring(4,6);
        switch(s1) {
            case "01": // 充电状态下
                locationStr = s.substring(102);
                extremeStr = s.substring(122);
                alertStr = s.substring(152);
                voltageStr = s.substring(172);
                volCount = Integer.parseInt(voltageStr.substring(22, 24),16);
                temperatureStr = s.substring(196 + 4 * volCount);
                break;
            default:
                motorStr = s.substring(102);
                // 判断电机个数
                if(Integer.parseInt(motorStr.substring(2, 4),16) == 1) {
                    locationStr = s.substring(130);
                    extremeStr = s.substring(150);
                    alertStr = s.substring(180);
                    voltageStr = s.substring(200);
                    volCount = Integer.parseInt(voltageStr.substring(22, 24),16);
                    temperatureStr = s.substring(224 + 4 * volCount);
                    s = vinStr + "," + timeStr + "," + vehicleStr + "," + motorStr + "," + locationStr + "," + extremeStr + "," + alertStr + "," + voltageStr + "," + temperatureStr;
                } else if(Integer.parseInt(motorStr.substring(2, 4),16) == 2) {
                    locationStr = s.substring(154);
                    extremeStr = s.substring(174);
                    alertStr = s.substring(204);
                    voltageStr = s.substring(224);
                    volCount = Integer.parseInt(voltageStr.substring(22, 24),16);
                    temperatureStr = s.substring(248 + 4 * volCount);
                    s = vinStr + "," + timeStr +  "," + vehicleStr + "," + motorStr + "," + locationStr + "," + extremeStr + "," + alertStr + "," + voltageStr + "," + temperatureStr;
                }
                break;
        }
        return s;
    }

}
