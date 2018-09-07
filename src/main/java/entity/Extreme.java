package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/5 14:24
 * 极值数据实体类
 **/
@Entity
public class Extreme {
    private String vol_max;
    private String vol_max_code;
    private String vol_max_value;
    private String vol_min;
    private String vol_min_code;
    private String vol_min_value;
    private String temperature_max;
    private String temperature_max_code;
    private String temperature_max_value;
    private String temperature_min;
    private String temperature_min_code;
    private String temperature_min_value;

    public Extreme(String vol_max, String vol_max_code, String vol_max_value, String vol_min, String vol_min_code, String vol_min_value, String temperature_max, String temperature_max_code, String temperature_max_value, String temperature_min, String temperature_min_code, String temperature_min_value) {
        this.vol_max = vol_max;
        this.vol_max_code = vol_max_code;
        this.vol_max_value = vol_max_value;
        this.vol_min = vol_min;
        this.vol_min_code = vol_min_code;
        this.vol_min_value = vol_min_value;
        this.temperature_max = temperature_max;
        this.temperature_max_code = temperature_max_code;
        this.temperature_max_value = temperature_max_value;
        this.temperature_min = temperature_min;
        this.temperature_min_code = temperature_min_code;
        this.temperature_min_value = temperature_min_value;
    }

    public String getVol_max() {
        return vol_max;
    }

    public void setVol_max(String vol_max) {
        this.vol_max = vol_max;
    }

    public String getVol_max_code() {
        return vol_max_code;
    }

    public void setVol_max_code(String vol_max_code) {
        this.vol_max_code = vol_max_code;
    }

    public String getVol_max_value() {
        return vol_max_value;
    }

    public void setVol_max_value(String vol_max_value) {
        this.vol_max_value = vol_max_value;
    }

    public String getVol_min() {
        return vol_min;
    }

    public void setVol_min(String vol_min) {
        this.vol_min = vol_min;
    }

    public String getVol_min_code() {
        return vol_min_code;
    }

    public void setVol_min_code(String vol_min_code) {
        this.vol_min_code = vol_min_code;
    }

    public String getVol_min_value() {
        return vol_min_value;
    }

    public void setVol_min_value(String vol_min_value) {
        this.vol_min_value = vol_min_value;
    }

    public String getTemperature_max() {
        return temperature_max;
    }

    public void setTemperature_max(String temperature_max) {
        this.temperature_max = temperature_max;
    }

    public String getTemperature_max_code() {
        return temperature_max_code;
    }

    public void setTemperature_max_code(String temperature_max_code) {
        this.temperature_max_code = temperature_max_code;
    }

    public String getTemperature_max_value() {
        return temperature_max_value;
    }

    public void setTemperature_max_value(String temperature_max_value) {
        this.temperature_max_value = temperature_max_value;
    }

    public String getTemperature_min() {
        return temperature_min;
    }

    public void setTemperature_min(String temperature_min) {
        this.temperature_min = temperature_min;
    }

    public String getTemperature_min_code() {
        return temperature_min_code;
    }

    public void setTemperature_min_code(String temperature_min_code) {
        this.temperature_min_code = temperature_min_code;
    }

    public String getTemperature_min_value() {
        return temperature_min_value;
    }

    public void setTemperature_min_value(String temperature_min_value) {
        this.temperature_min_value = temperature_min_value;
    }

    @Override
    public String toString() {
        return "Extreme{" +
                "vol_max='" + vol_max + '\'' +
                ", vol_max_code='" + vol_max_code + '\'' +
                ", vol_max_value='" + vol_max_value + '\'' +
                ", vol_min='" + vol_min + '\'' +
                ", vol_min_code='" + vol_min_code + '\'' +
                ", vol_min_value='" + vol_min_value + '\'' +
                ", temperature_max='" + temperature_max + '\'' +
                ", temperature_max_code='" + temperature_max_code + '\'' +
                ", temperature_max_value='" + temperature_max_value + '\'' +
                ", temperature_min='" + temperature_min + '\'' +
                ", temperature_min_code='" + temperature_min_code + '\'' +
                ", temperature_min_value='" + temperature_min_value + '\'' +
                '}';
    }
}
