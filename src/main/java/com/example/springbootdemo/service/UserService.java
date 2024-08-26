package com.example.springbootdemo.service;

import com.example.springbootdemo.model.Users;

import java.util.List;

public interface UserService {
    void creatUser(Users users);

    void updatUser(Users users);

    List<Users> getAllUsers();

    Users getUserId(Long id);

    void delUser(Long id);
}