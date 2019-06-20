package com.example.mypro.config;

import com.example.mypro.task.MailTask;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 整合Quartz ，默认多线程执行
 *
 * springboot自带 springTask 也是一种实现方式，但是不能持久化，暂不确定使用哪个
 */
@Configuration
public class QuartzConfig {

    private static final String MAIL_TASK = "MailTask";
    @Bean
    public JobDetail jobDetail(){
        return JobBuilder.newJob(MailTask.class).withIdentity(MAIL_TASK).storeDurably().build();
    }
    @Bean
    public Trigger trigger(){
        SimpleScheduleBuilder simpleScheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(10)  //时间
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(jobDetail()).withIdentity(MAIL_TASK).withSchedule(simpleScheduleBuilder).build();
    }
}
