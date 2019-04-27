package com.example.blogpostneww.controllers;

import com.example.blogpostneww.forms.Login;
import com.example.blogpostneww.services.BrugerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private BrugerService brugerService;

    @RequestMapping("/users/login")
    public String login(Login login){
        return "users/login";
    }
}
