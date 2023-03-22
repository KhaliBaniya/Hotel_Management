package org.example.entity;

import org.example.enums.TypeRooms;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {
    /*Room - Hotel da honalarni raqami,  joylashgan etaji, honalarni tiplari
    (oddiy hona,lixe hona, ikkitalik hona, oilaviy, Prezidentskiy hona - bular enum bo'lsin),
    bahosi (price), metr kvadrati (area) kabi ma'lumotlari bor.
  Bundan tashqari honada   qo'shimcha qulayliklar bo'lishi mumkun.
      Masalan:
      hona ichida basses bo'lishi mumkun,
      Honada souna bo'lishi mumkun,
      Honada karaoki bo'lishi mumkun.
      Honada mini bar bo'lishi mumkun.
      Konditsioner, Televizor bo'lishi mumkun.
    Qulayliklar alohida table bo'lsin.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "room_numbers")
    private Integer room_number;
    @Column(name = "floor")
    private Integer floor;
    @Column(name = "room_type")
    @Enumerated(EnumType.STRING)
    private TypeRooms room_type;
    @Column(name = "price")
    private Integer price;
    @Column(name = "area")
    private Double area;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public TypeRooms getRoom_type() {
        return room_type;
    }

    public void setRoom_type(TypeRooms room_type) {
        this.room_type = room_type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", room_number=" + room_number +
                ", floor=" + floor +
                ", room_type=" + room_type +
                ", price=" + price +
                ", area=" + area +
                '}';
    }
}
