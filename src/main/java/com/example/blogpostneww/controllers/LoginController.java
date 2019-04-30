package com.example.blogpostneww.controllers;

import com.example.blogpostneww.forms.Login;
import com.example.blogpostneww.services.BrugerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

public class LoginController {

    @Autowired
    private BrugerService brugerService;

    @RequestMapping("/users/login")
    private String login(Login login) {
        return "users/login";
    }

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginSide(@Valid Login login, BindingResult bindingResult) {
        if (brugerService.godkend(login.getBrugernavn(), login.getKodeord()))
            return "redirect:/";
        else
            return "users/login";

    }

}
