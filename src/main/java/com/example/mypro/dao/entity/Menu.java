package com.example.mypro.dao.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Slf4j
@Data
@TableName("t_Menu")
public class Menu implements Serializable{
    private Integer id;
    private String code;
    private String codeName;
    private String url;
    private String icon;
    private String order;
    private Integer parentId;

}
