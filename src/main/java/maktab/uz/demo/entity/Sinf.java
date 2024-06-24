package maktab.uz.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Sinf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private LocalDate boshlanganVaqt;

    public Sinf() {
    }

    public Sinf(Long id, String nom, LocalDate boshlanganVaqt) {
        this.id = id;
        this.nom = nom;
        this.boshlanganVaqt = boshlanganVaqt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getBoshlanganVaqt() {
        return boshlanganVaqt;
    }

    public void setBoshlanganVaqt(LocalDate boshlanganVaqt) {
        this.boshlanganVaqt = boshlanganVaqt;
    }
}
