package com.example.mypro;

import com.example.mypro.service.mail.MailService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyproApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private MailService mailService;
	@Test
	public void testMail(){
		mailService.sendMail("1049692342@qq.com","test mail","test content");

	}
}
