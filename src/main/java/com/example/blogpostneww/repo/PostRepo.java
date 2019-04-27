package com.example.blogpostneww.repo;

import com.example.blogpostneww.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, Long>

{

}
