package com.example.mypro.controller.base;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
@Data
@JsonSerialize(include= JsonSerialize.Inclusion.NON_NULL)
@Slf4j
public class ComResult implements Serializable{

    private static final long serialVersionUID = 1L;

    private static final String successCode = "0000";

    private String msg;
}
