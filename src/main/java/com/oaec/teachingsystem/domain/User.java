package com.oaec.teachingsystem.domain;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 用户类
 */
public class User {
    private Long id;
    private String uname;//姓名
    private String password;//密码
    private String headshot;//头像
    private String sex;//性别
    private Date birthday;//生日
    private String email;//邮箱
    private List<Course> courseList = new ArrayList<>(); //一对多课程
    private List<Notesonexperience> notesonexperienceList = new ArrayList<>();//一对多用户的心得笔记
    private List<Comment> commentList = new ArrayList<>();//一对多 用户心得笔记“评论”
    private List<Signin> signinList = new ArrayList<>();//一对多用户签到
    private int type;//类型 是否管理员 权限
    private String salt;//盐
    private List<Role> roles = new ArrayList<Role>();//用户拥有的角色列表


    public User(){}

    public User(String uname, String password, String headshot, String sex, Date birthday, String email, String salt) {
        this.uname = uname;
        this.password = password;
        this.headshot = headshot;
        this.sex = sex;
        this.birthday = birthday;
        this.email = email;
        this.salt = salt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Notesonexperience> getNotesonexperienceList() {
        return notesonexperienceList;
    }

    public void setNotesonexperienceList(List<Notesonexperience> notesonexperienceList) {
        this.notesonexperienceList = notesonexperienceList;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public List<Signin> getSigninList() {
        return signinList;
    }

    public void setSigninList(List<Signin> signinList) {
        this.signinList = signinList;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
