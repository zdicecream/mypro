package com.example.mypro.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@TableName("t_user")
@Slf4j
public class User {
    private Integer id;

    private String name;

    private String password;

    private String address;

    private Long money;

}