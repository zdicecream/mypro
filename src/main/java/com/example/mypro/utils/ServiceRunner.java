package com.example.mypro.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 实际在springCloud里mina ----------- 应该 ------不会使用
 */
@Component
@Order(2)
public class ServiceRunner implements CommandLineRunner{
    @Override
    public void run(String... args) throws Exception {

    }
}
