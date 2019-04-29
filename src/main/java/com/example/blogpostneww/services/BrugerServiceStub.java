package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Bruger;
import com.example.blogpostneww.repo.BrugerRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Primary
public class BrugerServiceStub implements BrugerInterface{

    @Autowired
    private BrugerRepoInterface brugerRepoInterface;

    @Override
    public boolean godkend(String brugernavn, String kodeord){
        return Objects.equals(brugernavn, kodeord);
    }

    @Override
    public Bruger opret(Bruger bruger){
        return this.brugerRepoInterface.save(bruger);
    }
}
