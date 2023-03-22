package org.example.repository;

import org.example.entity.Room;
import org.example.mapper.RoomMapper;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRepository {
    @Autowired
    private SessionFactory sessionFactory;
    /**** Admin Menu ***
     1. Room
     1. Add
     Enter number:
     Enter folder:
     Enter type:
     Enter price:
     Enter area:*/
    public void add(Room room){
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(room);
        transaction.commit();
        session.close();
    }

//    2. List
public List<Room> getAll() {
    Session session = sessionFactory.openSession();
    Query<Room> query = session.createQuery("  FROM Room " ,Room.class);
    List<Room> roomList = query.getResultList();
    session.close();
    return roomList;
}
/*3. Delete
Enter id:*/
public void delete(Room room) {
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    session.delete(room);
    transaction.commit();
    session.close();
}
/* 5. Update
        Enter id
        Enter number:
        Enter folder:
        Enter type:
        Enter price:
        Enter area:*/
public void update(Room room) {
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    session.update(room);
    transaction.commit();
    session.close();
}
/*6. Find
 Enter id*/
public Room FindById(int id) {
    Session session = sessionFactory.openSession();
    Room student = session.find(Room.class, id);
    session.close();
    return student;
}
}
