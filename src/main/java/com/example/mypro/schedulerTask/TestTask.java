package com.example.mypro.schedulerTask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {
    private int count=0;
    @Scheduled(cron = "*/5 * * * * ?") //5s一次
    public void process(){
        System.out.println("5S一次： "+(count++));
    }
}
