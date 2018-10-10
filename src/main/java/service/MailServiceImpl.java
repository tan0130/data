package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * create by 1311230692@qq.com on 2018/10/8 14:33
 * 邮件发送业务逻辑层实现
 **/
@Service("MailService")
public class MailServiceImpl implements MailService{

    @Autowired
    private JavaMailSender mailSender;

    @Value("${qq.mail.username}")
    private String from;

    @Override
    public void sendSimpleMail(String to, String subject, String content) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(from);
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);

        try {
            mailSender.send(simpleMailMessage);
            System.out.println("普通文本邮件已发送");
        } catch (Exception e) {
            System.out.println("普通文本邮件发送异常");
            e.printStackTrace();
        }
    }

    @Override
    public void sendHtmlMail(String to, String subject, String content) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8"); // 设置字符编码，避免中文乱码
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);

            mailSender.send(mimeMessage);
            System.out.println("HTML 格式邮件发送成功");
        } catch(MessagingException e) {
            System.out.println("HTML 格式邮件发送异常");
            e.printStackTrace();
        }
    }

    @Override
    public void sendAttatchmentMail(String to, String subject, String content, String filePath) {
        MimeMessage mimeMessage = mailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true); // 设置字符编码，避免中文乱码
            helper.setFrom(from);
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(content, true);

            FileSystemResource file = new FileSystemResource(new File(filePath));
            String fileName = file.getFilename();
            helper.addAttachment(fileName,file);

            mailSender.send(mimeMessage);
            System.out.println("带附件邮件发送成功");
        } catch(MessagingException e) {
            System.out.println("带附件邮件发送异常");
            e.printStackTrace();
        }
    }
}
