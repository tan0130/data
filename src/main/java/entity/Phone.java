package entity;

/**
 * create by 1311230692@qq.com on 2018/10/9 09:26
 * 手机号实体类
 **/
public class Phone {
    private String phone;

    public Phone() {
    }

    public Phone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phone='" + phone + '\'' +
                '}';
    }
}
