package com.example.blogpostneww.controllers;

import com.example.blogpostneww.forms.LoginForm;
import com.example.blogpostneww.services.BrugerServiceStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class LogInController {

@Autowired
    private BrugerServiceStub brugerServiceStub;

@RequestMapping("/users/login")
    public String login(LoginForm loginForm){
    return "users/login";
}

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "users/login";
        }

        if (!brugerServiceStub.godkend(

                loginForm.getBrugernavn(), loginForm.getKodeord())){
            return "users/login";
        }

        return "redirect:/";
}

}
