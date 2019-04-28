package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Post;
import com.example.blogpostneww.repo.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PostServiceConn implements PostService {


    @Autowired
    private PostRepo postRepo;


    @Override
        public List<Post> findAlle(){
        return this.postRepo.findAll();
    }

    @Override
        public Post findId(long id){
        //return this.postRepo.findOne(long id);
        return this.postRepo.getOne(id);
    }

    @Override
        public Post opret(Post post){
        return this.postRepo.save(post);
    }

    @Override
        public void sletId(long id) {
        // this.postRepo.delete(id);
        
    }
}
