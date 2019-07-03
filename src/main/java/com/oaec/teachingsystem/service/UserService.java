package com.oaec.teachingsystem.service;

import com.oaec.teachingsystem.domain.User;

import java.util.List;

public interface UserService {
    List<User> finAllUser();
    User findById(Long id);
    User findUserByname(String uname);
    int addUser(User user);
    int update(User user);
    int deleteById(Long id);
}
