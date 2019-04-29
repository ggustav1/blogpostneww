package com.example.blogpostneww.controllers;

import com.example.blogpostneww.models.Bruger;
import com.example.blogpostneww.models.Post;
import com.example.blogpostneww.services.BrugerInterface;
import com.example.blogpostneww.services.PostServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private PostServiceInterface postService;

    @Autowired
    private BrugerInterface brugerInterface;

    @RequestMapping("/")
    public String index(Model model) {
        List<Post> posts = postService.findAlle();
        model.addAttribute("posts", posts);

        return "index";
    }

    @GetMapping("/post/opret")
    public String opret(Model model) {
        model.addAttribute("Post", new Post());

        return "post/opret";
    }

    @PostMapping("/post/opret")
    public String opret(@ModelAttribute Post post, Model model) {
        postService.opret(post);
        model.addAttribute("Post", postService.findAlle());

        return "redirect:/";
    }

    @GetMapping("users/opretbruger")
    public String opretbruger(Model model) {
        model.addAttribute("Bruger", new Bruger());

        return "users/opretbruger";
    }

    @PostMapping("/users/opretbruger")
    public String opretbruger(@ModelAttribute Bruger bruger, Model model){
        brugerInterface.opret(bruger);
        model.addAttribute("Bruger", brugerInterface.opret(bruger));

        return "redirect:/";
    }
}
