package com.example.orisimpl.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/site")
public class WebController {

    @GetMapping("")
    public String getMainPage(){
        return "main";
    }

    @GetMapping("/registration")
    public String getRegisterPage(){
        return "register";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @GetMapping("/activation")
    public String getActivationPage(){return "activation";}

    @GetMapping("/check")
    public String getCheckPage(){
        return "check";
    }
}
