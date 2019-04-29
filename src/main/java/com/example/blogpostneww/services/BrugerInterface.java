package com.example.blogpostneww.services;

import com.example.blogpostneww.models.Bruger;

public interface BrugerInterface {
    boolean godkend(String brugernavn, String kodeord );

    Bruger opret(Bruger bruger);
}
