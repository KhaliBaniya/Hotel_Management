package org.example.entity;

import org.example.enums.WorkShift;

import javax.persistence.*;

@Entity
@Table(name = "clean_rooms")
public class CleanRooms {
    /*Tozalandan honalarni ham alohida tablega yozishimiz kerak.
      Qaysi ishchi, qaysi payt, qaysi honani tozolagani haqida malumotni yozib ketishimiz kerak.*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_worker_id")
    private Employee employee;

    @Column(name = "c_work_shift")
    @Enumerated(EnumType.STRING)
    private WorkShift work_Shift;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_id")
    private Room room;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public WorkShift getWork_Shift() {
        return work_Shift;
    }

    public void setWork_Shift(WorkShift work_Shift) {
        this.work_Shift = work_Shift;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
