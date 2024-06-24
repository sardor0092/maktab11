package maktab.uz.demo.entity;

import javax.persistence.*;

@Entity
public class Dars {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private  Uquvchi uquvchi;
    @ManyToOne
    private Fan fan;
    @ManyToOne
    private Uqituvchi uqituvchi;
    @ManyToOne
    private Xona xona;
    @ManyToOne
    private uquvYili uquvYili;
    @ManyToOne
    private Sinf sinfxona;


    public Dars() {
    }


    public Dars(Long id, Uquvchi uquvchi, Fan fan, Uqituvchi uqituvchi, Xona xona, maktab.uz.demo.entity.uquvYili uquvYili, Sinf sinfxona) {
        this.id = id;
        this.uquvchi = uquvchi;
        this.fan = fan;
        this.uqituvchi = uqituvchi;
        this.xona = xona;
        this.uquvYili = uquvYili;
        this.sinfxona = sinfxona;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Uquvchi getUquvchi() {
        return uquvchi;
    }

    public void setUquvchi(Uquvchi uquvchi) {
        this.uquvchi = uquvchi;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Uqituvchi getUqituvchi() {
        return uqituvchi;
    }

    public void setUqituvchi(Uqituvchi uqituvchi) {
        this.uqituvchi = uqituvchi;
    }

    public Xona getXona() {
        return xona;
    }

    public void setXona(Xona xona) {
        this.xona = xona;
    }

    public maktab.uz.demo.entity.uquvYili getUquvYili() {
        return uquvYili;
    }

    public void setUquvYili(maktab.uz.demo.entity.uquvYili uquvYili) {
        this.uquvYili = uquvYili;
    }

    public Sinf getSinfxona() {
        return sinfxona;
    }

    public void setSinfxona(Sinf sinfxona) {
        this.sinfxona = sinfxona;
    }
}
