package com.example.mypro.controller.login;

import com.example.mypro.controller.BaseController;
import com.example.mypro.domain.User;
import com.example.mypro.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RestController
public class indexController extends BaseController{
    @Autowired
    private IndexService indexService;

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
//        User user = indexService.selectByPrimaryKey(2);
        List<User> list = indexService.selectAll();
//        list.add(user);
        return list;
//        return "{date: '2016-05-02',name: '王小虎2',address: '上海市普陀区金沙江路 1518 弄',money: '1099999'}";
    }
}

