package com.example.blogpostneww.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String titel;

    @Lob @Column
    private String tekst;

    @Column
    private String forfatter;

    @Column(nullable = false)
    private Date dato = new Date();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public Date getDato() {
        return dato;
    }

    public void setDato(Date dato) {
        this.dato = dato;
    }

    public Post() {
    }

    public Post(long id, String titel, String tekst, String forfatter, Date dato) {
        this.id = id;
        this.titel = titel;
        this.tekst = tekst;
        this.forfatter = forfatter;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", tekst='" + tekst + '\'' +
                ", forfatter=" + forfatter +
                ", dato=" + dato +
                '}';
    }
}
