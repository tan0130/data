package dao;

import entity.*;

import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/9/5 15:23
 * 查询车辆历史报文信息
 **/
public interface VehicleDAO {

    /**
     * 根据车架号查找历史报文
     * @param vin 车架号
     * @param start_time 开始时间
     * @param end_time 结束时间
     * @param page 页码
     * @param limit 每页记录数
     * */
    List<History> getVehicleHistoryCode(String vin, String start_time, String end_time, int page, int limit);

    /**
     * 根据车架号查询记录数
     * @param vin 车架号
     * */
    int getCountByVin(String vin);

    /**
     * 查看整车数据的最新一条数据
     * @param vin 传入要查询的车架号
     * */
    List<Vehicle> getVehicleByVin(String vin);

    /**
     * 查看电机数据的最新一条数据
     * @param vin 传入要查询的车架号
     * */
    List<Motor> getMotorByVin(String vin);

    /**
     * 查看位置数据的最新一条数据
     * @param vin 传入要查询的车架号
     * */
    List<Location> getLocationByVin(String vin);

    /**
     * 查看极值数据的最新一条数据
     * @param vin 传入要查询的车架号
     * */
    List<Extreme> getExtremeByVin(String vin);

    /**
     * 查看报警数据的最新一条数据
     * @param vin 传入要查询的车架号
     * */
    List<Alert> getAlertByVin(String vin);

    /**
     * 查看状态数据的最新一条数据
     * @param vin 传入要查询的车架号
     * */
    List<State> getStateByVin(String vin);
}
