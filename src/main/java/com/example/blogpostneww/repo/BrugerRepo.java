package com.example.blogpostneww.repo;

import com.example.blogpostneww.models.Bruger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrugerRepo extends JpaRepository<Bruger, Long> {

}
