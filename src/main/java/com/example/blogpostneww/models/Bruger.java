package com.example.blogpostneww.models;

import javax.persistence.*;

@Entity
@Table(name = "bruger" )
public class Bruger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    public String brugernavn;

    @Column()
    public String kodeordHash;

    @Override
    public String toString() {
        return "Bruger{" +
                "id=" + id +
                ", brugernavn'" + brugernavn + '\'' +
                ", kodeordHash'" + kodeordHash + '\'' +
                '}';
    }

    public Bruger() {
        this.id = id;
        this.brugernavn = brugernavn;
        this.kodeordHash = kodeordHash;
    }

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
}
