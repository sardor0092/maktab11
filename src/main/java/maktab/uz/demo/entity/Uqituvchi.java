package maktab.uz.demo.entity;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Uqituvchi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ism;
    private String familiya;
    private LocalDate yosh;
    private String jins;
    private int maosh;

    public Uqituvchi() {
    }

    public Uqituvchi(Long id, String ism, String familiya, LocalDate yosh, String jins, int maosh) {
        this.id = id;
        this.ism = ism;
        this.familiya = familiya;
        this.yosh = yosh;
        this.jins = jins;
        this.maosh = maosh;
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

    public int getMaosh() {
        return maosh;
    }

    public void setMaosh(int maosh) {
        this.maosh = maosh;
    }
}
