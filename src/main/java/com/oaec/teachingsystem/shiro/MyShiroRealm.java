package com.oaec.teachingsystem.shiro;

import com.oaec.teachingsystem.domain.Permission;
import com.oaec.teachingsystem.domain.Role;
import com.oaec.teachingsystem.domain.User;
import com.oaec.teachingsystem.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Rainmean.Li
 * @create 2019-06-13 10:37
 **/
public class MyShiroRealm extends AuthorizingRealm {

    //用于用户查询
    @Autowired
    private UserService userService;

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        String username = authenticationToken.getPrincipal().toString();
        User user = userService.findUserByname(username);
        if (user == null) {
            //这里返回后会报出对应异常
            return null;
        } else {
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
            return simpleAuthenticationInfo;
        }
    }

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取当前登录用户
        User currUser = (User)principalCollection.getPrimaryPrincipal();
        //查询用户名称
        User user = userService.findUserByname(currUser.getUname());
        //添加角色和权限
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        System.out.println("角色数："+user.getRoles().size());
        for (Role role:user.getRoles()) {
            //添加角色
            simpleAuthorizationInfo.addRole(role.getName());
            System.out.println("权限数："+role.getPermissions().size());
            for (Permission permission:role.getPermissions()) {
                //添加权限
                simpleAuthorizationInfo.addStringPermission(permission.getMenuUrl());
                System.out.println(permission.getMenuUrl());
            }
        }
        return simpleAuthorizationInfo;
    }

}
