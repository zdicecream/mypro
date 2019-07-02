package com.example.mypro;

import org.springframework.format.annotation.DateTimeFormat;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.stream.Stream;

public class testStream {
    public static void main(String[] args){
//        List<String> list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("23");
//        Stream s =  list.stream();
////        System.out.println(s.findFirst().equals("2"));
////        s.forEach(System.out::println);
//        list.stream().filter(string ->string.isEmpty()).forEach(System.out::println);
//
//        List<String> strings = Arrays.asList("12","21","31");
//        strings.stream().filter(string -> !string.isEmpty() ).forEach(System.out::println);

        Instant instant = Instant.now();
        Date date = Date.from(instant);

        Calendar calendar = Calendar.getInstance();
        LocalDateTime localDateTime = LocalDateTime.now();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");



    }
}
