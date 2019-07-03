package com.oaec.teachingsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * 课程类
 */
public class Course {
    private Long id;
    private String cname;//课程名字
    private String content;//课程内容
    private List<Networkwork> networkworkList;//课程下的作业

    public Course() {
    }

    public Course(String cname, String content, List<Networkwork> networkworkList) {
        this.cname = cname;
        this.content = content;
        this.networkworkList = networkworkList;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Networkwork> getNetworkworkList() {
        return networkworkList;
    }

    public void setNetworkworkList(List<Networkwork> networkworkList) {
        this.networkworkList = networkworkList;
    }
}
