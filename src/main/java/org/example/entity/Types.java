package org.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "type")
public class Types {
    /*type (oshpaz, reseption, security, ofitsiant, barment, tozalovchi, usta,manager..)
        - type lar ham alohida bitta table da bo'lsin*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
@Column(name = "cook")
    private String cook;
    @Column(name = "reception")

    private String reception;
    @Column(name = "waiter")

    private String waiter;
    @Column(name = "barmen")

    private String barmen;
    @Column(name = "cleaner")

    private String cleaner;
    @Column(name = "artisan")

    private String artisan;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCook() {
        return cook;
    }

    public void setCook(String cook) {
        this.cook = cook;
    }

    public String getReception() {
        return reception;
    }

    public void setReception(String reception) {
        this.reception = reception;
    }

    public String getWaiter() {
        return waiter;
    }

    public void setWaiter(String waiter) {
        this.waiter = waiter;
    }

    public String getBarmen() {
        return barmen;
    }

    public void setBarmen(String barmen) {
        this.barmen = barmen;
    }

    public String getCleaner() {
        return cleaner;
    }

    public void setCleaner(String cleaner) {
        this.cleaner = cleaner;
    }

    public String getArtisan() {
        return artisan;
    }

    public void setArtisan(String artisan) {
        this.artisan = artisan;
    }

    @Override
    public String toString() {
        return "Types{" +
                "id='" + id + '\'' +
                ", cook='" + cook + '\'' +
                ", reception='" + reception + '\'' +
                ", waiter='" + waiter + '\'' +
                ", barmen='" + barmen + '\'' +
                ", cleaner='" + cleaner + '\'' +
                ", artisan='" + artisan + '\'' +
                '}';
    }
}
