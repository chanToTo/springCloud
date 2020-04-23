package com.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.domain.User;
import com.service.OrderService;
import com.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author orangeC
 * @description
 * @date 2020/4/22 20:17
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public List<User> get(String id) {
        return userService.getUserList(id);
    }
}
