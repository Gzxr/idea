package com.oaec.teachingsystem.mapper;

import com.oaec.teachingsystem.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    /**
     * 对于多个参数来说，每个参数之前都要加上@Param注解，
     * 要不然会找不到对应的参数进而报错
     */
    List<User> finAllUser();

    User findById(Long id);

    User findUserByname(String uname);

    int addUser(User user);

    int update(User user);

    int deleteById(Long id);


}
