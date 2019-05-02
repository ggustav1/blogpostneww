package com.example.blogpostneww.models;

import javax.persistence.*;
import java.time.LocalDate;

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
    private LocalDate dato = LocalDate.now().plusDays(1);

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

    public LocalDate getDato() {
        return dato;
    }

    public void setDato(LocalDate dato) {
        this.dato = dato;
    }

    public Post() {
    }

    public Post(long id, String titel, String tekst, LocalDate dato) {
        this.id = id;
        this.titel = titel;
        this.tekst = tekst;
        this.dato = dato;
    }


    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", tekst='" + tekst + '\'' +
                ", dato=" + dato +
                '}';
    }
}
