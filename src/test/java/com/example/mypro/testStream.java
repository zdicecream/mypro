package com.example.mypro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class testStream {
    public static void main(String[] args){
        List<String> list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("23");
        Stream s =  list.stream();
//        System.out.println(s.findFirst().equals("2"));
//        s.forEach(System.out::println);
        list.stream().filter(string ->string.isEmpty()).forEach(System.out::println);

        List<String> strings = Arrays.asList("12","21","31");
        strings.stream().filter(string -> !string.isEmpty() ).forEach(System.out::println);

    }
}
