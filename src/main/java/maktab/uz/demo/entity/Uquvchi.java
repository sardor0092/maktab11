package maktab.uz.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

public class Uquvchi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ism;
    private String familiya;
    private String sharif;
    private LocalDate yosh;
    private String jins;
    private int sinf;

    public Uquvchi() {
    }

    public Uquvchi(Long id, String ism, String familiya, String sharif, LocalDate yosh, String jins, int sinf) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.sharif = sharif;
        this.yosh = yosh;
        this.jins = jins;
        this.sinf = sinf;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getSharif() {
        return sharif;
    }

    public void setSharif(String sharif) {
        this.sharif = sharif;
    }

    public LocalDate getYosh() {
        return yosh;
    }

    public void setYosh(LocalDate yosh) {
        this.yosh = yosh;
    }

    public String getJins() {
        return jins;
    }

    public void setJins(String jins) {
        this.jins = jins;
    }

    public int getSinf() {
        return sinf;
    }

    public void setSinf(int sinf) {
        this.sinf = sinf;
    }
}
