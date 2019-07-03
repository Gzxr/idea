package com.oaec.teachingsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 心得笔记的评论类
 */
public class Comment {
    private Long id;
    private Long notesonexperience_id;//所属笔记
    private Long user_id;//所属用户id 用于数据库查询
    private User user;//属性user用于遍历在网页
    private String content;//评论内容
    private Date createtime;//评论时间

    public Comment() {
    }

    public Comment(Long notesonexperience_id, Long user_id, User user, String content, Date createtime) {
        this.notesonexperience_id = notesonexperience_id;
        this.user_id = user_id;
        this.user = user;
        this.content = content;
        this.createtime = createtime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNotesonexperience_id() {
        return notesonexperience_id;
    }

    public void setNotesonexperience_id(Long notesonexperience_id) {
        this.notesonexperience_id = notesonexperience_id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
