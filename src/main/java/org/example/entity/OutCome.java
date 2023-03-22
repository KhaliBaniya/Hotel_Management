package org.example.entity;

import org.example.enums.WorkShift;

import javax.persistence.*;

@Entity
@Table(name = "out_come")
public class OutCome {
    /*OutCome -  Chiqimlar. Mehmon hona uchun chiqimlarni bitta table qilishimiz kerak.
        Masalan svetga, gazga, internetga, kamunalniy to'lovlar, ishchilarni oyligi va hakozo.
        Har bir chiqimni o'zini tipi (unique nomi) bor.
      IshSmenasining o'zini alohida  table bo'ladi. (kunduzki, abetgi, kechgi,)*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "oc_electricity")

    private Double oc_electricity;
    @Column(name = "oc_gas")

    private Double oc_gas;
    @Column(name = "oc_internet")

    private Double oc_internet;
    @Column(name = "oc_utility_bills")

    private Double oc_utility_bills;
    @Column(name = "water")

    private Double water;

    @Column(name = "workers_salary")
    private Double workers_salary;

    @Column(name = "work_Shift")
    @Enumerated(EnumType.STRING)
    private WorkShift work_Shift;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getOc_electricity() {
        return oc_electricity;
    }

    public void setOc_electricity(Double oc_electricity) {
        this.oc_electricity = oc_electricity;
    }

    public Double getOc_gas() {
        return oc_gas;
    }

    public void setOc_gas(Double oc_gas) {
        this.oc_gas = oc_gas;
    }

    public Double getOc_internet() {
        return oc_internet;
    }

    public void setOc_internet(Double oc_internet) {
        this.oc_internet = oc_internet;
    }

    public Double getOc_utility_bills() {
        return oc_utility_bills;
    }

    public void setOc_utility_bills(Double oc_utility_bills) {
        this.oc_utility_bills = oc_utility_bills;
    }

    public Double getWater() {
        return water;
    }

    public void setWater(Double water) {
        this.water = water;
    }

    public Double getWorkers_salary() {
        return workers_salary;
    }

    public void setWorkers_salary(Double workers_salary) {
        this.workers_salary = workers_salary;
    }

    public WorkShift getWork_Shift() {
        return work_Shift;
    }

    public void setWork_Shift(WorkShift work_Shift) {
        this.work_Shift = work_Shift;
    }
}
