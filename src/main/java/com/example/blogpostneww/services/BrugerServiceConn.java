package com.example.blogpostneww.services;


import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BrugerServiceConn implements BrugerService {

    @Override
    public boolean godkend(String brugernavn, String kodeord){
        return Objects.equals(brugernavn, kodeord);
    }

}
