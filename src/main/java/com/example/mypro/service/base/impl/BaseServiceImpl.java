package com.example.mypro.service.base.impl;

import com.example.mypro.dao.mapper.Mapper;
import com.example.mypro.service.base.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;
@Slf4j
public  class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private Mapper<T> mapper;

    @Override
    public Integer save(T t) {
        return mapper.insert(t);
    }

    @Override
    public void save(List<T> list) {
        for(T t : list){
            mapper.insert(t);
        }
    }

    @Override
    public void delete(Serializable id) {
        mapper.deleteById(id);
    }

    @Override
    public void delete(List<Serializable> idList) {
        mapper.deleteBatchIds(idList);
    }

    @Override
    public void update(T t) {
        mapper.updateById(t);
    }

    @Override
    public void update(List<T> list) {
        for(T t : list){
            mapper.updateById(t);
        }
    }

    @Override
    public T getById(Serializable id) {
        return mapper.selectById(id);
    }

    @Override
    public List<T> findAll() {
        return mapper.selectList(null);
    }

    @Override
    public Mapper<T> getMapper() {
        return mapper;
    }

    @Override
    public T getOne(T t) {
        return mapper.selectOne(t);
    }
}
