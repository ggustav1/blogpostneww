package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Post;
import com.example.blogpostneww.repo.PostRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Primary
public class PostServiceConn implements PostServiceInterface {

    @Autowired
    private PostRepoInterface postRepo;

    @Override
        public List<Post> findAlle(){
        return this.postRepo.findAll();
    }

    @Override
        public Post opret(Post post){
        return this.postRepo.save(post);
    }

}