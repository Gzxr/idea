package com.oaec.teachingsystem.controller;

import com.oaec.teachingsystem.domain.User;
import com.oaec.teachingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    public UserService userService;

    @GetMapping("index")
    public String idnex(){
        return "admin/Aindex";
    }

    @GetMapping("listuser")
    public String listuser(Model model){
        List<User> list = userService.finAllUser();
        model.addAttribute("list",list);
        return "admin/list_user";
    }

    @GetMapping("edituser")
    public String edituser(Long id,Model model){
        User user = userService.findById(id);
        model.addAttribute("user",user);
        return "admin/edit_user";
    }

    @GetMapping("deleteuser")
    public String deleteuser(Long id,Model model){
        int i = userService.deleteById(id);
        if(i>0){
            model.addAttribute("message","删除成功");
            return "redirect:listuser";
        }else{
            model.addAttribute("error","删除失败！");
            return "admin/edit_user";
        }
    }

    @PostMapping("saveuser")
    public String saveuser(Long id,String uname, int sex, String sbirthday, String email, Model model){
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

        User user = userService.findById(id);
        user.setUname(uname);
        user.setSex(ifsex);
        user.setBirthday(birthday);
        user.setEmail(email);

        int i = userService.update(user);
        if(i>0){
            model.addAttribute("message","修改成功");
            return "redirect:listuser";
        }else{
            model.addAttribute("errror","修改失败！");
            return "redirect:listuser";
        }
    }


}
