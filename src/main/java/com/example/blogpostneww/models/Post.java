package com.example.blogpostneww.models;

import java.util.Date;

public class Post {

    private int id;
    private String titel;
    private String tekst;
    private Bruger forfatter;
    private Date dato = new Date();

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Bruger getForfatter() {
        return forfatter;
    }

    public void setForfatter(Bruger forfatter) {
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

    public Post(int id, String titel, String tekst, Bruger forfatter, Date dato) {
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
