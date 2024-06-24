package maktab.uz.demo.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class uquvYili {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate boshlanganVaqt;
    private LocalDate TugaganVaqt;
    private String izoh;

    public uquvYili() {
    }

    public uquvYili(Long id, LocalDate boshlanganVaqt, LocalDate tugaganVaqt, String izoh) {
        this.id = id;
        this.boshlanganVaqt = boshlanganVaqt;
        TugaganVaqt = tugaganVaqt;
        this.izoh = izoh;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBoshlanganVaqt() {
        return boshlanganVaqt;
    }

    public void setBoshlanganVaqt(LocalDate boshlanganVaqt) {
        this.boshlanganVaqt = boshlanganVaqt;
    }

    public LocalDate getTugaganVaqt() {
        return TugaganVaqt;
    }

    public void setTugaganVaqt(LocalDate tugaganVaqt) {
        TugaganVaqt = tugaganVaqt;
    }

    public String getIzoh() {
        return izoh;
    }

    public void setIzoh(String izoh) {
        this.izoh = izoh;
    }
}
