package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/5 13:49
 * 整车信息实体类
 **/
@Entity
public class Vehicle {
    private String speed_value;
    private String brake_percent;
    private String mileage_value;
    private String accelerate_percent;
    private String gear_value;
    private String run_mode;
    private String brake_state;
    private String accelerate_state;
    private String DCDC_state;
    private String vehicle_state;
    private String total_voltage;
    private String total_electricity;
    private String soc_value;
    private String resistance_value;
    private String charge_state;

    public Vehicle(String speed_value, String brake_percent, String mileage_value, String accelerate_percent, String gear_value, String run_mode, String brake_state, String accelerate_state, String DCDC_state, String vehicle_state, String total_voltage, String total_electricity, String soc_value, String resistance_value, String charge_state) {
        this.speed_value = speed_value;
        this.brake_percent = brake_percent;
        this.mileage_value = mileage_value;
        this.accelerate_percent = accelerate_percent;
        this.gear_value = gear_value;
        this.run_mode = run_mode;
        this.brake_state = brake_state;
        this.accelerate_state = accelerate_state;
        this.DCDC_state = DCDC_state;
        this.vehicle_state = vehicle_state;
        this.total_voltage = total_voltage;
        this.total_electricity = total_electricity;
        this.soc_value = soc_value;
        this.resistance_value = resistance_value;
        this.charge_state = charge_state;
    }

    public String getSpeed_value() {
        return speed_value;
    }

    public void setSpeed_value(String speed_value) {
        this.speed_value = speed_value;
    }

    public String getBrake_percent() {
        return brake_percent;
    }

    public void setBrake_percent(String brake_percent) {
        this.brake_percent = brake_percent;
    }

    public String getMileage_value() {
        return mileage_value;
    }

    public void setMileage_value(String mileage_value) {
        this.mileage_value = mileage_value;
    }

    public String getAccelerate_percent() {
        return accelerate_percent;
    }

    public void setAccelerate_percent(String accelerate_percent) {
        this.accelerate_percent = accelerate_percent;
    }

    public String getGear_value() {
        return gear_value;
    }

    public void setGear_value(String gear_value) {
        this.gear_value = gear_value;
    }

    public String getRun_mode() {
        return run_mode;
    }

    public void setRun_mode(String run_mode) {
        this.run_mode = run_mode;
    }

    public String getBrake_state() {
        return brake_state;
    }

    public void setBrake_state(String brake_state) {
        this.brake_state = brake_state;
    }

    public String getAccelerate_state() {
        return accelerate_state;
    }

    public void setAccelerate_state(String accelerate_state) {
        this.accelerate_state = accelerate_state;
    }

    public String getDCDC_state() {
        return DCDC_state;
    }

    public void setDCDC_state(String DCDC_state) {
        this.DCDC_state = DCDC_state;
    }

    public String getVehicle_state() {
        return vehicle_state;
    }

    public void setVehicle_state(String vehicle_state) {
        this.vehicle_state = vehicle_state;
    }

    public String getTotal_voltage() {
        return total_voltage;
    }

    public void setTotal_volatge(String total_voltage) {
        this.total_voltage = total_voltage;
    }

    public String getTotal_electricity() {
        return total_electricity;
    }

    public void setTotal_electricity(String total_electricity) {
        this.total_electricity = total_electricity;
    }

    public String getSoc_value() {
        return soc_value;
    }

    public void setSoc_value(String soc_value) {
        this.soc_value = soc_value;
    }

    public String getResistance_value() {
        return resistance_value;
    }

    public void setResistance_value(String resistance_value) {
        this.resistance_value = resistance_value;
    }

    public String getCharge_state() {
        return charge_state;
    }

    public void setCharge_state(String charge_state) {
        this.charge_state = charge_state;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed_value='" + speed_value + '\'' +
                ", brake_percent='" + brake_percent + '\'' +
                ", mileage_value='" + mileage_value + '\'' +
                ", accelerate_percent='" + accelerate_percent + '\'' +
                ", gear_value='" + gear_value + '\'' +
                ", run_mode='" + run_mode + '\'' +
                ", brake_state='" + brake_state + '\'' +
                ", accelerate_state='" + accelerate_state + '\'' +
                ", DCDC_state='" + DCDC_state + '\'' +
                ", vehicle_state='" + vehicle_state + '\'' +
                ", total_voltage='" + total_voltage + '\'' +
                ", total_electricity='" + total_electricity + '\'' +
                ", soc_value='" + soc_value + '\'' +
                ", resistance_value='" + resistance_value + '\'' +
                ", charge_state='" + charge_state + '\'' +
                '}';
    }
}
