package com.example.blogpostneww.models;

public class Bruger {
    private String brugernavn;
    private String passwordHash;
    private String fuldNavn;

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFuldNavn() {
        return fuldNavn;
    }

    public void setFuldNavn(String fuldNavn) {
        this.fuldNavn = fuldNavn;
    }

    public Bruger(){

    }

    public Bruger(String brugernavn, String passwordHash, String fuldNavn) {
        this.brugernavn = brugernavn;
        this.passwordHash = passwordHash;
        this.fuldNavn = fuldNavn;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "brugernavn='" + brugernavn + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", fuldNavn='" + fuldNavn + '\'' +
                '}';
    }
}
