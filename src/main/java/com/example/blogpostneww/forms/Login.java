package com.example.blogpostneww.forms;


import javax.validation.constraints.NotNull;

public class Login {

    @NotNull
    private String kodeord;

    private String brugernavn;

    public String getKodeord() {
        return kodeord;
    }

    public void setKodeord(String kodeord) {
        this.kodeord = kodeord;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }
}
