package com.example.mypro.service;

import com.example.mypro.domain.User;

import java.util.List;

public interface IndexService {
    public List<User> selectAll();
    public User selectByPrimaryKey(Integer id);
}
