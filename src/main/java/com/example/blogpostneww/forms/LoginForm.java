package com.example.blogpostneww.forms;

import javax.validation.constraints.NotNull;

public class LoginForm {
    @NotNull
    private String kodeord;

    private String brugernavn;

    @Override
    public String toString() {
        return "LoginForm{" +
                "kodeord='" + kodeord + '\'' +
                ", brugernavn='" + brugernavn + '\'' +
                '}';
    }

    public LoginForm(@NotNull String kodeord, String brugernavn) {
        this.kodeord = kodeord;
        this.brugernavn = brugernavn;
    }

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
