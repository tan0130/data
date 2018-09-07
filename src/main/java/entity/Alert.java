package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/5 14:34
 * 报警信息实体类
 **/
@Entity
public class Alert {
    private String vin;
    private String temp_differ_alert;
    private String temp_high_alert;
    private String type_high_alert;
    private String type_low_alert;
    private String soc_high_alert;
    private String soc_low_alert;
    private String battery_high_alert;
    private String battery_low_alert;
    private String soc_jump_alert;
    private String insulation_alert;
    private String sys_differ_alert;
    private String battery_differ_alert;
    private String DCDC_temp_alert;
    private String DCDC_status_alert;
    private String type_high_alert1;
    private String controller_temperature_alert;
    private String high_voltage_alert;
    private String motor_temperature_alert;
    private String brake_sys_alert;

    public Alert(String vin, String temp_differ_alert, String temp_high_alert, String type_high_alert, String type_low_alert, String soc_high_alert, String soc_low_alert, String battery_high_alert, String battery_low_alert, String soc_jump_alert, String insulation_alert, String sys_differ_alert, String battery_differ_alert, String DCDC_temp_alert, String DCDC_status_alert, String type_high_alert1, String controller_temperature_alert, String high_voltage_alert, String motor_temperature_alert, String brake_sys_alert) {
        this.vin = vin;
        this.temp_differ_alert = temp_differ_alert;
        this.temp_high_alert = temp_high_alert;
        this.type_high_alert = type_high_alert;
        this.type_low_alert = type_low_alert;
        this.soc_high_alert = soc_high_alert;
        this.soc_low_alert = soc_low_alert;
        this.battery_high_alert = battery_high_alert;
        this.battery_low_alert = battery_low_alert;
        this.soc_jump_alert = soc_jump_alert;
        this.insulation_alert = insulation_alert;
        this.sys_differ_alert = sys_differ_alert;
        this.battery_differ_alert = battery_differ_alert;
        this.DCDC_temp_alert = DCDC_temp_alert;
        this.DCDC_status_alert = DCDC_status_alert;
        this.type_high_alert1 = type_high_alert1;
        this.controller_temperature_alert = controller_temperature_alert;
        this.high_voltage_alert = high_voltage_alert;
        this.motor_temperature_alert = motor_temperature_alert;
        this.brake_sys_alert = brake_sys_alert;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getTemp_differ_alert() {
        return temp_differ_alert;
    }

    public void setTemp_differ_alert(String temp_differ_alert) {
        this.temp_differ_alert = temp_differ_alert;
    }

    public String getTemp_high_alert() {
        return temp_high_alert;
    }

    public void setTemp_high_alert(String temp_high_alert) {
        this.temp_high_alert = temp_high_alert;
    }

    public String getType_high_alert() {
        return type_high_alert;
    }

    public void setType_high_alert(String type_high_alert) {
        this.type_high_alert = type_high_alert;
    }

    public String getType_low_alert() {
        return type_low_alert;
    }

    public void setType_low_alert(String type_low_alert) {
        this.type_low_alert = type_low_alert;
    }

    public String getSoc_high_alert() {
        return soc_high_alert;
    }

    public void setSoc_high_alert(String soc_high_alert) {
        this.soc_high_alert = soc_high_alert;
    }

    public String getSoc_low_alert() {
        return soc_low_alert;
    }

    public void setSoc_low_alert(String soc_low_alert) {
        this.soc_low_alert = soc_low_alert;
    }

    public String getBattery_high_alert() {
        return battery_high_alert;
    }

    public void setBattery_high_alert(String battery_high_alert) {
        this.battery_high_alert = battery_high_alert;
    }

    public String getBattery_low_alert() {
        return battery_low_alert;
    }

    public void setBattery_low_alert(String battery_low_alert) {
        this.battery_low_alert = battery_low_alert;
    }

    public String getSoc_jump_alert() {
        return soc_jump_alert;
    }

    public void setSoc_jump_alert(String soc_jump_alert) {
        this.soc_jump_alert = soc_jump_alert;
    }

    public String getInsulation_alert() {
        return insulation_alert;
    }

    public void setInsulation_alert(String insulation_alert) {
        this.insulation_alert = insulation_alert;
    }

    public String getSys_differ_alert() {
        return sys_differ_alert;
    }

    public void setSys_differ_alert(String sys_differ_alert) {
        this.sys_differ_alert = sys_differ_alert;
    }

    public String getBattery_differ_alert() {
        return battery_differ_alert;
    }

    public void setBattery_differ_alert(String battery_differ_alert) {
        this.battery_differ_alert = battery_differ_alert;
    }

    public String getDCDC_temp_alert() {
        return DCDC_temp_alert;
    }

    public void setDCDC_temp_alert(String DCDC_temp_alert) {
        this.DCDC_temp_alert = DCDC_temp_alert;
    }

    public String getDCDC_status_alert() {
        return DCDC_status_alert;
    }

    public void setDCDC_status_alert(String DCDC_status_alert) {
        this.DCDC_status_alert = DCDC_status_alert;
    }

    public String getType_high_alert1() {
        return type_high_alert1;
    }

    public void setType_high_alert1(String type_high_alert1) {
        this.type_high_alert1 = type_high_alert1;
    }

    public String getController_temperature_alert() {
        return controller_temperature_alert;
    }

    public void setController_temperature_alert(String controller_temperature_alert) {
        this.controller_temperature_alert = controller_temperature_alert;
    }

    public String getHigh_voltage_alert() {
        return high_voltage_alert;
    }

    public void setHigh_voltage_alert(String high_voltage_alert) {
        this.high_voltage_alert = high_voltage_alert;
    }

    public String getMotor_temperature_alert() {
        return motor_temperature_alert;
    }

    public void setMotor_temperature_alert(String motor_temperature_alert) {
        this.motor_temperature_alert = motor_temperature_alert;
    }

    public String getBrake_sys_alert() {
        return brake_sys_alert;
    }

    public void setBrake_sys_alert(String brake_sys_alert) {
        this.brake_sys_alert = brake_sys_alert;
    }

    @Override
    public String toString() {
        return "Alert{" +
                "vin='" + vin + '\'' +
                ", temp_differ_alert='" + temp_differ_alert + '\'' +
                ", temp_high_alert='" + temp_high_alert + '\'' +
                ", type_high_alert='" + type_high_alert + '\'' +
                ", type_low_alert='" + type_low_alert + '\'' +
                ", soc_high_alert='" + soc_high_alert + '\'' +
                ", soc_low_alert='" + soc_low_alert + '\'' +
                ", battery_high_alert='" + battery_high_alert + '\'' +
                ", battery_low_alert='" + battery_low_alert + '\'' +
                ", soc_jump_alert='" + soc_jump_alert + '\'' +
                ", insulation_alert='" + insulation_alert + '\'' +
                ", sys_differ_alert='" + sys_differ_alert + '\'' +
                ", battery_differ_alert='" + battery_differ_alert + '\'' +
                ", DCDC_temp_alert='" + DCDC_temp_alert + '\'' +
                ", DCDC_status_alert='" + DCDC_status_alert + '\'' +
                ", type_high_alert1='" + type_high_alert1 + '\'' +
                ", controller_temperature_alert='" + controller_temperature_alert + '\'' +
                ", high_voltage_alert='" + high_voltage_alert + '\'' +
                ", motor_temperature_alert='" + motor_temperature_alert + '\'' +
                ", brake_sys_alert='" + brake_sys_alert + '\'' +
                '}';
    }
}
