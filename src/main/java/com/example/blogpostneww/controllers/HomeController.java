package com.example.blogpostneww.controllers;

import com.example.blogpostneww.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired //
    private PostService postService;

    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
}
