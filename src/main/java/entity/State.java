package entity;

import javax.persistence.Entity;

/**
 * create by 1311230692@qq.com on 2018/9/7 09:47
 * 车辆登入登出状态实体类
 **/
@Entity
public class State {
    private String terminal_in_code;
    private String terminal_out_code;
    private String terminal_in_time;
    private String terminal_out_time;
    private String iccid_code;

    public State(String terminal_in_code, String terminal_out_code, String terminal_in_time, String terminal_out_time, String iccid_code) {
        this.terminal_in_code = terminal_in_code;
        this.terminal_out_code = terminal_out_code;
        this.terminal_in_time = terminal_in_time;
        this.terminal_out_time = terminal_out_time;
        this.iccid_code = iccid_code;
    }

    public String getTerminal_in_code() {
        return terminal_in_code;
    }

    public void setTerminal_in_code(String terminal_in_code) {
        this.terminal_in_code = terminal_in_code;
    }

    public String getTerminal_out_code() {
        return terminal_out_code;
    }

    public void setTerminal_out_code(String terminal_out_code) {
        this.terminal_out_code = terminal_out_code;
    }

    public String getTerminal_in_time() {
        return terminal_in_time;
    }

    public void setTerminal_in_time(String terminal_in_time) {
        this.terminal_in_time = terminal_in_time;
    }

    public String getTerminal_out_time() {
        return terminal_out_time;
    }

    public void setTerminal_out_time(String terminal_out_time) {
        this.terminal_out_time = terminal_out_time;
    }

    public String getIccid_code() {
        return iccid_code;
    }

    public void setIccid_code(String iccid_code) {
        this.iccid_code = iccid_code;
    }

    @Override
    public String toString() {
        return "State{" +
                "terminal_in_code='" + terminal_in_code + '\'' +
                ", terminal_out_code='" + terminal_out_code + '\'' +
                ", terminal_in_time='" + terminal_in_time + '\'' +
                ", terminal_out_time='" + terminal_out_time + '\'' +
                ", iccid_code='" + iccid_code + '\'' +
                '}';
    }
}
