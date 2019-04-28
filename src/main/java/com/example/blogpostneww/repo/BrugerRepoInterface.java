package com.example.blogpostneww.repo;

import com.example.blogpostneww.models.Bruger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrugerRepoInterface extends JpaRepository<Bruger, Long> {


}
