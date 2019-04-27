package com.example.blogpostneww.controllers;

import com.example.blogpostneww.models.Post;
import com.example.blogpostneww.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
    @Autowired
    private PostService postService;

    @RequestMapping("/post/view/{id}")
    public String view(@PathVariable("id")int id, Model model){
        Post post = postService.findId(id);
        model.addAttribute("post", post);
        return "post/view";
    }


}
