package com.example.mypro.service.mail.impl;

import com.example.mypro.service.mail.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service("mailService")
public class MailServiceImpl implements MailService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Value("${mail.fromMail.addr}")
    private String addr;

    SimpleMailMessage message = null;

    @Override
    public void sendMail(String to, String subject, String content) {
        message = new SimpleMailMessage();
        message.setFrom(addr);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        try{
            javaMailSender.send(message);
            log.info("邮件已发送！");
        }catch (Exception e){
            log.error("邮件发送异常！");
            log.error(e.getMessage());
        }

    }
}
