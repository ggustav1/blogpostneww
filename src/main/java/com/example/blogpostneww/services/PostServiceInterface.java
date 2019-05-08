package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Post;

import java.util.List;

public interface PostServiceInterface {

    List<Post> findAlle();
    Post opret(Post post);



}
//Dette interface indeholder alle de funktionaliteter som vores blog har.