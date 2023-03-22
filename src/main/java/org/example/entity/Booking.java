package org.example.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    /*Booking - zakaz qilish, honani band qilish. Bu table da Qaysi quest, qaysi honani, qasyi sanadan ,
      nechi kunga band qilganligi haqida malumotlar bo'ladi.
      Bundan tashqari band qilish nechi pul bo'lganini hisoblab shu table ga yozib qo'yamiz.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "b_guest_id")
    private Guest guest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "b_room_id")
    private Room room;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "b_price")
    private Integer b_price;

}
