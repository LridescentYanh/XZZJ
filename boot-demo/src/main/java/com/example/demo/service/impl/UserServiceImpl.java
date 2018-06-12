package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: springbootdemo
 * @description: 用户逻辑层
 * @author: ZHSKG YANH
 * @create: 2018-06-12 09:32
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao dao;

    public User findUserByName(String name) {
        return dao.findByName(name);
    }
}
