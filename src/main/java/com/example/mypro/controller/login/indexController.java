package com.example.mypro.controller.login;

import com.example.mypro.controller.base.BaseController;
import com.example.mypro.controller.base.BaseResponse;
import com.example.mypro.dao.entity.User;
import com.example.mypro.service.index.IndexService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
//    测试reids
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

    @RequestMapping("/getRe")
    @Cacheable( value = "user-key")
    public Object testGetRedis(){
        return indexService.findAll();

    }

    @RequestMapping("/getRe1")
    public Object testGetRedis1(){
        return indexService.findAll();

    }

    @RequestMapping("/setRe")
    public String testSetRedis(){
        User user = new User();
        user.setName("xiaohu");
        user.setMoney((long) 10000);
        user.setAddress("中国中国中国中国111");
        user.setPassword("root");
        indexService.save(user);

        return "success";

    }

//    测试主页
//    @RequestMapping("/")
//    public ModelAndView indext(ModelAndView modelAndView) {
//        modelAndView.setViewName("index");
//        int a = 0;
//
//        List<String> aa = new ArrayList<String>();
//        for (String s : aa) {
//
//        }
//        //modelAndView.addObject("userList", userService.selectList(null));
//        return modelAndView;
//    }
//    @RequestMapping("/show")
//    public ModelAndView show(ModelAndView modelAndView) {
//        modelAndView.setViewName("show");
//        return modelAndView;
//    }
    @RequestMapping(value = "/getUserJson",method = RequestMethod.GET)
    public BaseResponse<List<User>> getUserJson() {
        List<User> list = indexService.findAll();
        return new BaseResponse<List<User>>().SuccResponse(list);
    }

    @RequestMapping(value = "/getUser/{id}",method = RequestMethod.GET)
    public BaseResponse<User> getUser(@RequestParam("id") Integer id) {
        User user = indexService.getById(id);
        return new BaseResponse<User>().SuccResponse(user);
    }

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public BaseResponse<String> addUser(User user){
        return new BaseResponse<String>().SuccResponse("");
    }

    @RequestMapping(value = "/editUser",method = RequestMethod.PUT)
    public BaseResponse<String> editUser(User user) {
        indexService.update(user);
        return new BaseResponse<String>().SuccResponse("");
    }
    @RequestMapping(value = "/delUser",method = RequestMethod.DELETE)
    public BaseResponse<String> delUser(@RequestParam("id") Integer id) {
        indexService.delete(id);
        return new BaseResponse<String>().SuccResponse("");
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public BaseResponse<String> login(String username,String password){
        User userPara =  new User();
        userPara.setName(username);
//        userPara.setPassword(password);
        User user = indexService.getOne(userPara);
        if(user!=null && user.getPassword().equals(password)){
            redisTemplate.opsForValue().set("user",username);
            log.info("ss");
            return new BaseResponse<String>().SuccResponse("");
        }else{
            log.info("ffs");
            return new BaseResponse<String>().falseResponse();
        }

    }
}

