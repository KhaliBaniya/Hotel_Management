package org.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "guest")
public class Guest {
    /*Guest - Mehmonlarning  name, surname, phone lari bor.
    Bundan tashqari ularning passport raqami, berilan joy, beriglan vaqti  kabi  malumotlari bor.
    Passport malumotlari alohida table da saqlaymiz.
    Passport ning raqami (AA123456), qachon berilgani, amal qilish sanasi, kim tomondan berilgani, qayerdan berilganiligi bor.*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")

    private String surname;
    @Column(name = "phone")

    private String phone;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinTable(name = "passport_information")
    // @JoinColumn(name = "passport_information")
    private PassportInformation passportInformation;

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

    public PassportInformation getPassportInformation() {
        return passportInformation;
    }

    public void setPassportInformation(PassportInformation passportInformation) {
        this.passportInformation = passportInformation;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", passportInformation=" + passportInformation +
                '}';
    }
}
