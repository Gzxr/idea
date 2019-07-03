package com.oaec.teachingsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "index";
    }

    @GetMapping("/inlogin")
    public String inlogin(){
        return "login";
    }

    @GetMapping("/inregister")
    public String inregister(){
        return "register";
    }








}
