package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/5 15:07
 * 历史报文实体类
 **/
@Entity
public class History {
    private String vin;
    private String server_time;
    private String code_time;
    private String code_type;
    private String code_check;
    private String code_length;
    private String code_origin;
    private String code_vehicle;
    private String code_motor;
    private String code_location;
    private String code_extreme;
    private String code_alert;
    private String code_voltage;
    private String code_temperature;

    public History(String vin, String server_time, String code_time, String code_type, String code_check, String code_length, String code_origin, String code_vehicle, String code_motor, String code_location, String code_extreme, String code_alert, String code_voltage, String code_temperature) {
        this.vin = vin;
        this.server_time = server_time;
        this.code_time = code_time;
        this.code_type = code_type;
        this.code_check = code_check;
        this.code_length = code_length;
        this.code_origin = code_origin;
        this.code_vehicle = code_vehicle;
        this.code_motor = code_motor;
        this.code_location = code_location;
        this.code_extreme = code_extreme;
        this.code_alert = code_alert;
        this.code_voltage = code_voltage;
        this.code_temperature = code_temperature;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getServer_time() {
        return server_time;
    }

    public void setServer_time(String server_time) {
        this.server_time = server_time;
    }

    public String getCode_time() {
        return code_time;
    }

    public void setCode_time(String code_time) {
        this.code_time = code_time;
    }

    public String getCode_type() {
        return code_type;
    }

    public void setCode_type(String code_type) {
        this.code_type = code_type;
    }

    public String getCode_check() {
        return code_check;
    }

    public void setCode_check(String code_check) {
        this.code_check = code_check;
    }

    public String getCode_length() {
        return code_length;
    }

    public void setCode_length(String code_length) {
        this.code_length = code_length;
    }

    public String getCode_origin() {
        return code_origin;
    }

    public void setCode_origin(String code_origin) {
        this.code_origin = code_origin;
    }

    public String getCode_vehicle() {
        return code_vehicle;
    }

    public void setCode_vehicle(String code_vehicle) {
        this.code_vehicle = code_vehicle;
    }

    public String getCode_motor() {
        return code_motor;
    }

    public void setCode_motor(String code_motor) {
        this.code_motor = code_motor;
    }

    public String getCode_location() {
        return code_location;
    }

    public void setCode_location(String code_location) {
        this.code_location = code_location;
    }

    public String getCode_extreme() {
        return code_extreme;
    }

    public void setCode_extreme(String code_extreme) {
        this.code_extreme = code_extreme;
    }

    public String getCode_alert() {
        return code_alert;
    }

    public void setCode_alert(String code_alert) {
        this.code_alert = code_alert;
    }

    public String getCode_voltage() {
        return code_voltage;
    }

    public void setCode_voltage(String code_voltage) {
        this.code_voltage = code_voltage;
    }

    public String getCode_temperature() {
        return code_temperature;
    }

    public void setCode_temperature(String code_temperature) {
        this.code_temperature = code_temperature;
    }

    @Override
    public String toString() {
        return "History{" +
                "vin='" + vin + '\'' +
                ", server_time='" + server_time + '\'' +
                ", code_time='" + code_time + '\'' +
                ", code_type='" + code_type + '\'' +
                ", code_check='" + code_check + '\'' +
                ", code_length='" + code_length + '\'' +
                ", code_origin='" + code_origin + '\'' +
                ", code_vehicle='" + code_vehicle + '\'' +
                ", code_motor='" + code_motor + '\'' +
                ", code_location='" + code_location + '\'' +
                ", code_extreme='" + code_extreme + '\'' +
                ", code_alert='" + code_alert + '\'' +
                ", code_voltage='" + code_voltage + '\'' +
                ", code_temperature='" + code_temperature + '\'' +
                '}';
    }
}
