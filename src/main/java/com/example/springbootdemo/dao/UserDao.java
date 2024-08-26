package com.example.springbootdemo.dao;

import com.example.springbootdemo.model.Users;

import java.util.List;

public interface UserDao {
    void creatUser(Users users);

    void updatUser(Users users);

    List<Users> getAllUsers();

    Users getUserId(Long id);

    void delUser(Long id);
}