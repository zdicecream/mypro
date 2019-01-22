package com.example.mypro.controller.login;

import com.example.mypro.controller.base.BaseController;
import com.example.mypro.domain.User;
import com.example.mypro.service.index.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class indexController extends BaseController{
    @Autowired
    private IndexService indexService;
    @Autowired
    private RedisTemplate<Serializable,Object> redisTemplate;

    @RequestMapping("/set")
    public String setRedis(){
        User user = new User();
        user.setName("xiaohu");
        user.setMoney((long) 10000);
        user.setAddress("中国中国中国中国111");
        user.setPassword("root");
        redisTemplate.opsForValue().set("user1",user);
        return "存储";
    }
    @RequestMapping("/get")
    public Object getRedis(){
        return redisTemplate.opsForValue().get("user1");
    }

    @RequestMapping("/")
    public ModelAndView indext(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        int a = 0;

        List<String> aa = new ArrayList<String>();
        for (String s : aa) {
            
        }
        //modelAndView.addObject("userList", userService.selectList(null));
        return modelAndView;
    }
    @RequestMapping("/show")
    public ModelAndView show(ModelAndView modelAndView) {
        modelAndView.setViewName("show");
        return modelAndView;
    }
    @RequestMapping("/getUserJson")
    public List<User> getUserJson() {
        List<User> list = indexService.findAll();
        return list;
    }
    @RequestMapping("/editUser")
    public String editUser(User user) {
        indexService.update(user);
        return "success";
    }
    @RequestMapping("/delUser")
    public String delUser(@RequestParam("id") Integer id) {
        indexService.delete(id);
        return "success";
    }
}

