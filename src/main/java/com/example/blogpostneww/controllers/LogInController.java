package com.example.blogpostneww.controllers;

import com.example.blogpostneww.forms.LoginForm;
import com.example.blogpostneww.services.BrugerServiceStub;
import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;



/*
@Autowired
    private BrugerServiceStub brugerServiceStub;

@RequestMapping("/users/login")
    public String login(LoginForm loginForm){
    return "users/login";
}

    @RequestMapping(value = "/users/login", method = RequestMethod.POST)
    public String loginPage(@Valid LoginForm loginForm, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "users/fejlsidelogin1";
        }

        else if (!brugerServiceStub.godkend(

                loginForm.getBrugernavn(), loginForm.getKodeord())){
            return "users/fejlsidelogin2";
        }
        return "redirect:/";
    }
*/

    @Controller
    public class LogInController implements WebMvcConfigurer {

        @Override
        public void addViewControllers(ViewControllerRegistry registry) {
            registry.addViewController("/users/successside").setViewName("users/successside");
        }

        @GetMapping("/")
        public String showForm(LoginForm loginForm) {
            return "/users/login";
        }

        @PostMapping("/")
        public String checkPersonInfo(@Valid LoginForm loginForm, BindingResult bindingResult) {

            if (bindingResult.hasErrors()) {
                return "users/login";
            }

            return "redirect:/successside";
        }

}
