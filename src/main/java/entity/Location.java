package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/5 14:18
 * 位置信息实体类
 **/
@Entity
public class Location {
    private String gps_state;
    private String vehicle_state;
    private String longitude_value;
    private String latitude_value;

    public Location(String gps_state, String vehicle_state, String longitude_value, String latitude_value) {
        this.gps_state = gps_state;
        this.vehicle_state = vehicle_state;
        this.longitude_value = longitude_value;
        this.latitude_value = latitude_value;
    }

    public String getGps_state() {
        return gps_state;
    }

    public void setGps_state(String gps_state) {
        this.gps_state = gps_state;
    }

    public String getVehicle_state() {
        return vehicle_state;
    }

    public void setVehicle_state(String vehicle_state) {
        this.vehicle_state = vehicle_state;
    }

    public String getLongitude_value() {
        return longitude_value;
    }

    public void setLongitude_value(String longitude_value) {
        this.longitude_value = longitude_value;
    }

    public String getLatitude() {
        return latitude_value;
    }

    public void setLatitude(String latitude_value) {
        this.latitude_value = latitude_value;
    }

    @Override
    public String toString() {
        return "Location{" +
                "gps_state='" + gps_state + '\'' +
                ", vehicle_state='" + vehicle_state + '\'' +
                ", longitude_value='" + longitude_value + '\'' +
                ", latitude_value='" + latitude_value + '\'' +
                '}';
    }
}
