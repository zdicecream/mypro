package com.example.mypro.dao.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Data
@TableName("t_user")
@Slf4j
public class User implements Serializable{
    private Integer id;

    private String name;

    private String password;

    private String address;

    private Long money;

}