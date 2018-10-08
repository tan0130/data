package service;

/**
 * create by 1311230692@qq.com on 2018/10/8 14:30
 * 发送邮件业务接口
 **/
public interface MailService {
    /**
     * 简单文本邮件发送
     * @param to 邮件接收者
     * @param subject 邮件主题
     * @param content 邮件内容
     * */
    void sendSimpleMail(String to, String subject, String content);

    /**
     * 发送富文本邮件 支持文本、附件、HTML、图片等
     * @param to 邮件接收者
     * @param subject 邮件主题
     * @param content 邮件内容
     * */
    void sendHtmlMail(String to, String subject, String content);

    /**
     * 发送带附件的邮件
     * @param to 邮件接收者
     * @param subject 邮件主题
     * @param content 邮件内容
     * @param filePath 附件地址
     * */
    void sendAttatchmentMail(String to, String subject, String content, String filePath);
}
