package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/5 13:56
 * 驱动电机数据实体类
 **/
@Entity
public class Motor {
    private String code_time;
    private String code_valid;
    private String motor_num;
    private String motor_sid1;
    private String motor_state1;
    private String motor_voltage1;
    private String motor_electricity1;
    private String motor_temperature1;
    private String controller_temperature1;
    private String motor_speed1;
    private String motor_torque1;
    private String motor_sid2;
    private String motor_state2;
    private String motor_voltage2;
    private String motor_electricity2;
    private String motor_temperature2;
    private String controller_temperature2;
    private String motor_speed2;
    private String motor_torque2;

    public Motor(String code_time, String code_valid, String motor_num, String motor_sid1, String motor_state1, String motor_voltage1, String motor_electricity1, String motor_temperature1, String controller_temperature1, String motor_speed1, String motor_torque1, String motor_sid2, String motor_state2, String motor_voltage2, String motor_electricity2, String motor_temperature2, String controller_temperature2, String motor_speed2, String motor_torque2) {
        this.code_time = code_time;
        this.code_valid = code_valid;
        this.motor_num = motor_num;
        this.motor_sid1 = motor_sid1;
        this.motor_state1 = motor_state1;
        this.motor_voltage1 = motor_voltage1;
        this.motor_electricity1 = motor_electricity1;
        this.motor_temperature1 = motor_temperature1;
        this.controller_temperature1 = controller_temperature1;
        this.motor_speed1 = motor_speed1;
        this.motor_torque1 = motor_torque1;
        this.motor_sid2 = motor_sid2;
        this.motor_state2 = motor_state2;
        this.motor_voltage2 = motor_voltage2;
        this.motor_electricity2 = motor_electricity2;
        this.motor_temperature2 = motor_temperature2;
        this.controller_temperature2 = controller_temperature2;
        this.motor_speed2 = motor_speed2;
        this.motor_torque2 = motor_torque2;
    }

    public String getCode_time() {
        return code_time;
    }

    public void setCode_time(String code_time) {
        this.code_time = code_time;
    }

    public String getCode_valid() {
        return code_valid;
    }

    public void setCode_valid(String code_valid) {
        this.code_valid = code_valid;
    }

    public String getMotor_num() {
        return motor_num;
    }

    public void setMotor_num(String motor_num) {
        this.motor_num = motor_num;
    }

    public String getMotor_sid1() {
        return motor_sid1;
    }

    public void setMotor_sid1(String motor_sid1) {
        this.motor_sid1 = motor_sid1;
    }

    public String getMotor_state1() {
        return motor_state1;
    }

    public void setMotor_state1(String motor_state1) {
        this.motor_state1 = motor_state1;
    }

    public String getMotor_voltage1() {
        return motor_voltage1;
    }

    public void setMotor_voltage1(String motor_voltage1) {
        this.motor_voltage1 = motor_voltage1;
    }

    public String getMotor_electricity1() {
        return motor_electricity1;
    }

    public void setMotor_electricity1(String motor_electricity1) {
        this.motor_electricity1 = motor_electricity1;
    }

    public String getMotor_temperature1() {
        return motor_temperature1;
    }

    public void setMotor_temperature1(String motor_temperature1) {
        this.motor_temperature1 = motor_temperature1;
    }

    public String getController_temperature1() {
        return controller_temperature1;
    }

    public void setController_temperature1(String controller_temperature1) {
        this.controller_temperature1 = controller_temperature1;
    }

    public String getMotor_speed1() {
        return motor_speed1;
    }

    public void setMotor_speed1(String motor_speed1) {
        this.motor_speed1 = motor_speed1;
    }

    public String getMotor_torque1() {
        return motor_torque1;
    }

    public void setMotor_torque1(String motor_torque1) {
        this.motor_torque1 = motor_torque1;
    }

    public String getMotor_sid2() {
        return motor_sid2;
    }

    public void setMotor_sid2(String motor_sid2) {
        this.motor_sid2 = motor_sid2;
    }

    public String getMotor_state2() {
        return motor_state2;
    }

    public void setMotor_state2(String motor_state2) {
        this.motor_state2 = motor_state2;
    }

    public String getMotor_voltage2() {
        return motor_voltage2;
    }

    public void setMotor_voltage2(String motor_voltage2) {
        this.motor_voltage2 = motor_voltage2;
    }

    public String getMotor_electricity2() {
        return motor_electricity2;
    }

    public void setMotor_electricity2(String motor_electricity2) {
        this.motor_electricity2 = motor_electricity2;
    }

    public String getMotor_temperature2() {
        return motor_temperature2;
    }

    public void setMotor_temperature2(String motor_temperature2) {
        this.motor_temperature2 = motor_temperature2;
    }

    public String getController_temperature2() {
        return controller_temperature2;
    }

    public void setController_temperature2(String controller_temperature2) {
        this.controller_temperature2 = controller_temperature2;
    }

    public String getMotor_speed2() {
        return motor_speed2;
    }

    public void setMotor_speed2(String motor_speed2) {
        this.motor_speed2 = motor_speed2;
    }

    public String getMotor_torque2() {
        return motor_torque2;
    }

    public void setMotor_torque2(String motor_torque2) {
        this.motor_torque2 = motor_torque2;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "code_time='" + code_time + '\'' +
                ", code_valid='" + code_valid + '\'' +
                ", motor_num='" + motor_num + '\'' +
                ", motor_sid1='" + motor_sid1 + '\'' +
                ", motor_state1='" + motor_state1 + '\'' +
                ", motor_voltage1='" + motor_voltage1 + '\'' +
                ", motor_electricity1='" + motor_electricity1 + '\'' +
                ", motor_temperature1='" + motor_temperature1 + '\'' +
                ", controller_temperature1='" + controller_temperature1 + '\'' +
                ", motor_speed1='" + motor_speed1 + '\'' +
                ", motor_torque1='" + motor_torque1 + '\'' +
                ", motor_sid2='" + motor_sid2 + '\'' +
                ", motor_state2='" + motor_state2 + '\'' +
                ", motor_voltage2='" + motor_voltage2 + '\'' +
                ", motor_electricity2='" + motor_electricity2 + '\'' +
                ", motor_temperature2='" + motor_temperature2 + '\'' +
                ", controller_temperature2='" + controller_temperature2 + '\'' +
                ", motor_speed2='" + motor_speed2 + '\'' +
                ", motor_torque2='" + motor_torque2 + '\'' +
                '}';
    }
}
