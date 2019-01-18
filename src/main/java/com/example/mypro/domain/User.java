package com.example.mypro.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@Data
@TableName("t_user")
public class User {
    private Integer id;

    private String name;

    private String password;

    private String address;

    private Long money;

}