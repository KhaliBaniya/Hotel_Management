package org.example.entity;

import org.example.enums.Petition_Type;
import org.w3c.dom.Text;

import javax.persistence.Column;

public class Petitions {
    /*Arznomalar table li bo'lishi kerak. Unda ishchilar yoki mehmonlar jaloba qoldirishlari mumkun.
      Jalobalarni statusi bo'ladi. Huddi (Yangi,O'rganilmoqda, chora ko'rildi, bekor qilindi) kabi
        statuslarda bo'lishi mumkun.*/
    @Column(name = "guest_petition")

    private Text guest_petition;
    @Column(name = "worker_petition")

    private Text worker_petition;
    @Column(name = "petition_type")

    private Petition_Type petition_type;

    public Text getGuest_petition() {
        return guest_petition;
    }

    public void setGuest_petition(Text guest_petition) {
        this.guest_petition = guest_petition;
    }

    public Text getWorker_petition() {
        return worker_petition;
    }

    public void setWorker_petition(Text worker_petition) {
        this.worker_petition = worker_petition;
    }

    public Petition_Type getPetition_type() {
        return petition_type;
    }

    public void setPetition_type(Petition_Type petition_type) {
        this.petition_type = petition_type;
    }
}
