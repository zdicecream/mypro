package com.example.mypro.controller.login;

import com.example.mypro.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class indexController extends BaseController{


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
}

