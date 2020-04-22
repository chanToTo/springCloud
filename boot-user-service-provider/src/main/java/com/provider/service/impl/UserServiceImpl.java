package com.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.domain.User;
import com.service.UserService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author orangeC
 * @description
 * @date 2020/4/22 19:48
 */
@Service(interfaceClass = UserService.class)
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getUserList(String id) {
        List<User> list = new ArrayList<>();
        list.add(new User(1, "orange"));
        list.add(new User(2, "charles"));
        return list;
    }
}
