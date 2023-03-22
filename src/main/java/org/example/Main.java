package org.example;

import org.example.config.Config;
import org.example.entity.Room;
import org.example.enums.TypeRooms;
import org.example.repository.AdminRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        AdminRepository adminRepository = (AdminRepository) applicationContext.getBean("adminRepository");

//        Room room = new Room();
//        room.setRoom_number(21);
//        room.setFloor(4);
//        room.setRoom_type(TypeRooms.family_room);
//        room.setPrice(350);
//        room.setArea(250d);
//
//        adminRepository.add(room);

//        List<Room> list = adminRepository.getAll();
//       System.out.println(list);


          // update
//        Room room = new Room();
//        room.setId(1);
//        room.setFloor(1);
//        room.setArea(255d);
//        adminRepository.update(room);

//        6. Find
//        Enter id
//        Room room = adminRepository.FindById(2);
//        System.out.println(room);



    }
}