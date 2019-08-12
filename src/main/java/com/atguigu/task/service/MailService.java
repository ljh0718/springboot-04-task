package com.atguigu.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Z
 * @create 2019/8/12 16:12
 */
@Service
public class MailService {
    @Autowired
    JavaMailSenderImpl mailSender;

    private int i = 1;

    @Scheduled(cron = "0 0 * * * MON-SAT")
    public void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("tongzhi");
        message.setText("今晚开会");

        message.setTo("3415692780@qq.com");
        message.setFrom("971860007@qq.com");
        mailSender.send(message);

        System.out.println("发送第"+i+"成功");
        i++;
    }
}
