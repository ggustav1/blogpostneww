package com.example.blogpostneww.models;

import javax.persistence.*;

@Entity
@Table(name = "Brugere")
public class Bruger {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String brugernavn;

    @Column
    private String kodeordHash;

    @Column
    private String fuldNavn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Bruger(Long id, String brugernavn, String kodeordHash, String fuldNavn) {
        this.id = id;
        this.brugernavn = brugernavn;
        this.kodeordHash = kodeordHash;
        this.fuldNavn = fuldNavn;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "id=" + id +
                ", brugernavn='" + brugernavn + '\'' +
                ", kodeordHash='" + kodeordHash + '\'' +
                ", fuldNavn='" + fuldNavn + '\'' +
                '}';
    }
}
