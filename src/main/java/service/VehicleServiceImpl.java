package service;

import dao.VehicleDAO;
import entity.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * create by 1311230692@qq.com on 2018/9/5 15:32
 * 车辆历史报文查询业务逻辑层实现
 **/
@Service("VehicleService")
public class VehicleServiceImpl implements VehicleService{

    // 注入 dao 层
    @Resource
    private VehicleDAO vehicleDAO;

    @Override
    public List<History> getVehicleHistoryCode(String vin, String start_time, String end_time, int page, int limit) {
        return vehicleDAO.getVehicleHistoryCode(vin, start_time, end_time, page, limit);
    }

    @Override
    public int getCountByVin(String vin) {
        return vehicleDAO.getCountByVin(vin);
    }

    @Override
    public List<Vehicle> getVehicleByVin(String vin) {
        return vehicleDAO.getVehicleByVin(vin);
    }

    @Override
    public List<Motor> getMotorByVin(String vin) {
        return vehicleDAO.getMotorByVin(vin);
    }

    @Override
    public List<Location> getLocationByVin(String vin) {
        return vehicleDAO.getLocationByVin(vin);
    }

    @Override
    public List<Extreme> getExtremeByVin(String vin) {
        return vehicleDAO.getExtremeByVin(vin);
    }

    @Override
    public List<Alert> getAlertByVin(String vin) {
        return vehicleDAO.getAlertByVin(vin);
    }

    @Override
    public List<State> getStateByVin(String vin) {
        return vehicleDAO.getStateByVin(vin);
    }
}
