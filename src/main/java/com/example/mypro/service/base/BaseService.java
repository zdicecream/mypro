package com.example.mypro.service.base;

import com.example.mypro.mapper.Mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {
    public Integer save(T t);
    public void save(List<T> list);
    public void delete(Serializable id);
    public void delete(List<Serializable> idList);
    public void update(T t);
    public void update(List<T> list);
    public T getById(Serializable id);
    public List<T> findAll();
    public Mapper<T> getMapper();
}
