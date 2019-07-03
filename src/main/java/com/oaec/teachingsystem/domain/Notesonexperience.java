package com.oaec.teachingsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 心得笔记
 */
public class Notesonexperience {
    private Long id;

    private Long user_id;//所属用户id
    private User user;//用于显示页面用
    private Date createtime;//创建时间
    private String title;//标题
    private String content;//内容
    private String uname;//用户名称
    private String uheadshot;//用户头像
    private List<Comment> commentList = new ArrayList<>();//笔记评论

    public Notesonexperience(){};

    public Notesonexperience(Long user_id, User user, Date createtime, String title, String content, String uname, String uheadshot, List<Comment> commentList) {
        this.user_id = user_id;
        this.user = user;
        this.createtime = createtime;
        this.title = title;
        this.content = content;
        this.uname = uname;
        this.uheadshot = uheadshot;
        this.commentList = commentList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Comment> getCommentList() {
        return commentList;
    }

    public void setCommentList(List<Comment> commentList) {
        this.commentList = commentList;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUheadshot() {
        return uheadshot;
    }

    public void setUheadshot(String uheadshot) {
        this.uheadshot = uheadshot;
    }
}
