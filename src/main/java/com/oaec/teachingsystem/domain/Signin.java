package com.oaec.teachingsystem.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * 签到类
 */

public class Signin {
    private Long id;
    private User user;//所属用户
    private Date signintime;//签到日期

    public Signin(User user, Date signintime) {
        this.user = user;
        this.signintime = signintime;
    }


}
