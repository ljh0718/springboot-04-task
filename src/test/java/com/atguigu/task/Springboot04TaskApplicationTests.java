package com.atguigu.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot04TaskApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("tongzhi");
        message.setText("今晚开会");

        message.setTo("zhongshuai9697@163.com");
        message.setFrom("971860007@qq.com");
        mailSender.send(message);
    }

    @Test
    public void test01() throws MessagingException {
        //1、创建一个复杂的消息邮件
        MimeMessage message = mailSender.createMimeMessage();

        MimeMessageHelper messageHelper = new MimeMessageHelper(message,true);
        //SimpleMailMessage message = new SimpleMailMessage();  --->简单邮件

        //邮件设置
        messageHelper.setSubject("进入启动盘方法");
        messageHelper.setText("<b style='red'>神舟u盘启动快捷键 http://www.udaxia.com/wtjd/13735.html</b>",true);

        messageHelper.addAttachment("全新95版本地图代码.txt",new File("C:\\Users\\Honey\\Desktop\\全新95版本地图代码.txt"));

        messageHelper.setTo("3415692780@qq.com");
        messageHelper.setFrom("971860007@qq.com");
        mailSender.send(message);
    }
}
