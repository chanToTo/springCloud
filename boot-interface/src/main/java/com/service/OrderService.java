package com.service;

import com.domain.User;

import java.util.List;

public interface OrderService {

    List<User> get(String id);
}
