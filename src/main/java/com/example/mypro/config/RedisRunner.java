package com.example.mypro.config;

import com.example.mypro.dao.entity.Menu;
import com.example.mypro.service.system.MenuService;
import com.example.mypro.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Component
@Order(1)
public class RedisRunner implements CommandLineRunner {

    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private MenuService menuService;

    @Override
    public void run(String... args) throws Exception {
        //缓存所有菜单项到redis
        List<Menu> menus = menuService.findAll();
        menus.forEach( menu -> redisUtil.set(menu.getCode(),menu.getCodeName()));

        //Set<Menu> menuSet =  redisUtil.setMembers(null);
        //缓存所有字段项到redis
    }
}
