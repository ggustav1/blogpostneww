package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Post;

import java.util.List;

public interface PostService {

    List<Post> findAlle();
    Post findId(int id);
    Post opret(Post post);
    Post rediger(Post post);
    void sletId(int id);
}
//Dette interface indeholder alle de funktionaliteter som vores blog har.