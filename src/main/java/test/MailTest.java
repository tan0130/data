package test;

import org.junit.Test;
import service.MailService;

import javax.annotation.Resource;

/**
 * create by 1311230692@qq.com on 2018/10/8 15:01
 * 邮件发送测试类
 **/
public class MailTest extends BaseJunit{
    @Resource(name="MailService")
    private MailService mailService;

    @Test
    public void mailSendTest() throws Exception {
        mailService.sendSimpleMail("1441159735@qq.com", "邮件收发测试", "这是第一封邮件");
        System.out.println("邮件发送成功");
    }

    @Test
    public void mailHtmlTest() throws Exception {
        String content = "<html>\n" + "<body>\n" +
                "<h3>hello world 这是第一封 html 邮件！</h3>\n" + "<a href=https://www.baidu.com>激活</a>\n" +
                "</body>\n" + "</html>\n";
        mailService.sendHtmlMail("1441159735@qq.com", "邮件收发测试", content);
        System.out.println("HTML 格式邮件发送成功");
    }

    @Test
    public void mailAttatchmentTest() throws Exception {
        String filePath = "/Users/15dcc/Html/test1.html";
        mailService.sendAttatchmentMail("1441159735@qq.com", "邮件收发测试", "有附件，请查收", filePath);
        System.out.println("带附件邮件发送成功");
    }
}
