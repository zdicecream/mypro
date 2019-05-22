package com.example.mypro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.example.mypro.dao.mapper")
@EnableScheduling  //定时任务
public class MyproApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproApplication.class, args);
	}


}
