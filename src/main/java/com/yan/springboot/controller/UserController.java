package com.yan.springboot.controller;

import com.yan.springboot.entity.User;
import com.yan.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 2018/8/27$ {Yan_y}
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/yan")
    public List login(){
        User user=new User();
        user.getId();
        user.getPassword();
        user.getUserName();
        List<User> list= userService.findUserId();
        return  list;
    }

    @RequestMapping("/test")
    public String test(){
        return "/login";
    }

}
