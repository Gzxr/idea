package com.oaec.teachingsystem.domain;

import javax.persistence.*;

@Entity
@Table(name="t_permission")
public class Permission {

    @Id //主键注解
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成策略
    private Integer id;

    @Column(name = "menu_name")
    private String menuName;//权限名

    @Column(name = "menu_url")
    private String menuUrl;//权限url

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }
}
