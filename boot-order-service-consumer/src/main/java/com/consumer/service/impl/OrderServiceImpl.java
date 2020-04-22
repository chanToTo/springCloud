package com.consumer.service.impl;

import com.domain.User;
import com.service.UserService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author orangeC
 * @description
 * @date 2020/4/22 20:17
 */
@Reference
public class OrderServiceImpl implements UserService{

    @Autowired
    private UserService userService;


    @Override
    public List<User> getUserList(String id) {
        return userService.getUserList(id);
    }
}
