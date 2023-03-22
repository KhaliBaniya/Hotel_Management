package org.example.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "passport_information")
public class PassportInformation {
    /*Passport ning raqami (AA123456),
     qachon berilgani, amal qilish sanasi,
     kim tomondan berilgani, qayerdan berilganiligi bor*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "passport_num")
    private String passport_num;

    @Column(name = "date_of_issue")
    private Date date_of_issue;

    @Column(name = "date_of_expiry")
    private Date date_of_expiry;

    @Column(name = "whom_given")
    private String whom_given;

    @Column(name = "where_given")
    private String where_given;



}
