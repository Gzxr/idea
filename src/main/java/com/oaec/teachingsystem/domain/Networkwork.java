package com.oaec.teachingsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 电子作业类
 */
public class Networkwork {
    private Long id;
    private Long createid;//创建作业的管理员id
    private Date createtime;//发布作业的时间
    private String subject;//题目
    private Date simtime;//提交作业的时间
    private Long simuid;//提交作业的用户id
    private String content;//提交作业的内容
    private Long course_id;//课程id
    private Course course;


    public Networkwork() {
    }

    public Networkwork(Long createid, Date createtime, String subject, Date simtime, Long simuid, String content, Long course_id, Course course) {
        this.createid = createid;
        this.createtime = createtime;
        this.subject = subject;
        this.simtime = simtime;
        this.simuid = simuid;
        this.content = content;
        this.course_id = course_id;
        this.course = course;
    }

    public Long getCreateid() {
        return createid;
    }

    public void setCreateid(Long createid) {
        this.createid = createid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getSimtime() {
        return simtime;
    }

    public void setSimtime(Date simtime) {
        this.simtime = simtime;
    }

    public Long getSimuid() {
        return simuid;
    }

    public void setSimuid(Long simuid) {
        this.simuid = simuid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Long course_id) {
        this.course_id = course_id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
