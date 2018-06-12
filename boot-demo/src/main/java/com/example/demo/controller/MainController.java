package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: boot-demo
 * @description:
 * @author: ZHSKG YANH
 * @create: 2018-06-12 10:23
 **/
@Controller
@RequestMapping("main")
public class MainController {

    @Autowired
    UserService userService;
    @Autowired
    UserDao userDao;


    @RequestMapping("index")
    public String index(){
        return  "index";
    }

    @RequestMapping("user")
    @ResponseBody
    public List<User> findAll(){
        List<User> users=userDao.findAll();
        return  users;
    }
    @RequestMapping("byName")
    @ResponseBody
    public User byName(){
        User user = userService.findUserByName("嘎嘎");
        User user1=new User();
        user1.setName("新增选手");
        user1.setPassword("awe");
        userDao.save(user1);
        return user;
    }



}
