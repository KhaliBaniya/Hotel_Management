package org.example.entity;
import org.example.enums.Status;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employee")
public class Employee {
    /*Employee - Ishchilarning ismi, familiyasi, tel_raqami, tug'ilgan sana, status (ACTIVE,NOT_ACTIVE)
    types (oshpaz, reseption, security, ofitsiant, barment, tozalovchi, usta,manager..)
        - types lar ham alohida bitta table da bo'lsin*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "e_name")
    private String name;
    @Column(name = "e_surname")

    private String surname;
    @Column(name = "e_phone")

    private String phone;
    @Column(name = "e_birth_date")

    private Date birth_date;
    @Column(name = "e_types")
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "types_id")
//    @JoinTable(name = "types")
    private Types types;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", birth_date=" + birth_date +
                ", status=" + status +
                ", types=" + types +
                '}';
    }
}
