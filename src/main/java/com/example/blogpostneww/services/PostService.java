package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Post;

import java.util.List;

public interface PostService {

    List<Post> findAlle();
    Post findId(long id);
    Post opret(Post post);
    void sletId(long id);


}
//Dette interface indeholder alle de funktionaliteter som vores blog har.