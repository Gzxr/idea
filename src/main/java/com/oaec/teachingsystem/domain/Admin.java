package com.oaec.teachingsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;


/**
 * 管理员类
 */
public class Admin {
    private Long id;
    private String aname;//姓名
    private String password;//密码
    private String sex;//性别
    private Date birthday;//生日
    private String email;//邮箱
    private String salt;//盐

    public Admin() {
    }

    public Admin(String aname, String password, String sex, Date birthday, String email, String salt) {
        this.aname = aname;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.salt = salt;
    }

}
