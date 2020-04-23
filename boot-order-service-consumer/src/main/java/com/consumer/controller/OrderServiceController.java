package com.consumer.controller;

import com.consumer.service.impl.OrderServiceImpl;
import com.domain.User;
import com.service.OrderService;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author orangeC
 * @description
 * @date 2020/4/22 19:57
 */
@RestController
@RequestMapping("/userService")
public class OrderServiceController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getUser")
    @ResponseBody
    public List<User> getUserList(@RequestParam String id) {
        return orderService.get(id);
    }
}
