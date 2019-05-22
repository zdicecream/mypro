package com.example.mypro;

import com.example.mypro.dao.entity.User;
import com.example.mypro.service.index.IndexService;
import net.bytebuddy.asm.Advice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailTests {
    @Autowired
    private IndexService indexService;

    @Test
    public void testone(){
        List<User> userList = indexService.findAll();
        System.out.println(userList.size());
    }
}
