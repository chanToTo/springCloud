package com.domain;

import lombok.Data;

/**
 * @author orangeC
 * @description
 * @date 2020/4/22 19:43
 */
@Data
public class User {

    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
