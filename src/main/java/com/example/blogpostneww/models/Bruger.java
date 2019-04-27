package com.example.blogpostneww.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Brugere")
public class Bruger {

    @Column(nullable = false)
    private String brugernavn;

    @Column
    private String kodeordHash;

    @Column
    private String fuldNavn;

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getKodeordHash() {
        return kodeordHash;
    }

    public void setKodeordHash(String kodeordHash) {
        this.kodeordHash = kodeordHash;
    }

    public String getFuldNavn() {
        return fuldNavn;
    }

    public void setFuldNavn(String fuldNavn) {
        this.fuldNavn = fuldNavn;
    }

    public Bruger(){

    }

    public Bruger(String brugernavn, String kodeordHash, String fuldNavn) {
        this.brugernavn = brugernavn;
        this.kodeordHash = kodeordHash;
        this.fuldNavn = fuldNavn;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "brugernavn='" + brugernavn + '\'' +
                ", kodeordHash='" + kodeordHash + '\'' +
                ", fuldNavn='" + fuldNavn + '\'' +
                '}';
    }
}
