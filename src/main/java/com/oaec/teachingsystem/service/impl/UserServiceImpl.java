package com.oaec.teachingsystem.service.impl;

import com.oaec.teachingsystem.domain.User;

import com.oaec.teachingsystem.mapper.UserMapper;
import com.oaec.teachingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> finAllUser() {
        return userMapper.finAllUser();
    }

    public User findById(Long id) {
        return userMapper.findById(id);
    }

    public User findUserByname(String uname){
        return userMapper.findUserByname(uname);
    }

    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    public int update(User user) {
        return userMapper.update(user);
    }

    public int deleteById(Long id) {
        int i = userMapper.deleteById(id);
        return i;
    }
}
