package com.oaec.teachingsystem.controller;

import com.oaec.teachingsystem.domain.User;
import com.oaec.teachingsystem.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    public UserService userService;

    @PostMapping("/login")
    public String login(String uname, String password, Model model, HttpSession session){
        User user = userService.findUserByname(uname);
        if(user!=null){
            if(password.equals(user.getPassword())){
                session.setAttribute("user",user);
                return "index";
            }else{
                model.addAttribute("error","密码错误");
                return "login";
            }
        }else{
            model.addAttribute("error","用户名不存在");
            return "login";
        }
    }

    @PostMapping("/register")
    public String register(String uname, String password, int sex,
                           String sbirthday, String email,Model model){
        String ifsex ="";
        Date birthday = null;
        if(sex==0){
            ifsex="男";
        }else{
            ifsex="女";
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try{
            birthday = dateFormat.parse(sbirthday);
        } catch (ParseException e){
            e.printStackTrace();
        }

        User user = new User(uname,password,"xxx.img",ifsex,birthday,email,"asdasd");
        int i = userService.addUser(user);
        if(i>0){
            model.addAttribute("message","注册成功！");
            return "login";
        }else {
            model.addAttribute("error", "注册失败，用户名已注册");
            return "register";
        }
    }

    public String deleteUser(Long id,Model model){
        userService.deleteById(id);
        model.addAttribute("message","删除成功");
        return "index";
    }


}
