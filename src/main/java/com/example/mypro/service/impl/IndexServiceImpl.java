package com.example.mypro.service.impl;

import com.example.mypro.domain.User;
import com.example.mypro.mapper.UserMapper;
import com.example.mypro.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("indexService")
public class IndexServiceImpl implements IndexService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAll() {
        return userMapper.selectList(null);
    }

    public User selectByPrimaryKey(Integer id) {
        return userMapper.selectById(id);
    }
}
