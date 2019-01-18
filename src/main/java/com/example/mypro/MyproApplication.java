package com.example.mypro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.mypro.mapper")
public class MyproApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyproApplication.class, args);
	}
}
