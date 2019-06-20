package com.example.mypro.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class TaskRunner implements CommandLineRunner {
    @Autowired
    private QuartzConfig quartzConfig;
    @Override
    public void run(String... args) throws Exception {
        quartzConfig.scheduleJobs();
    }
}
