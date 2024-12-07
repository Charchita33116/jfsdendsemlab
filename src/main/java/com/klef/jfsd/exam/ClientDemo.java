package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();

        // Creating Car
        Car car = new Car();
        car.setName("Honda City");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);
        session.save(car);

        // Creating Truck
        Truck truck = new Truck();
        truck.setName("Volvo Truck");
        truck.setType("Truck");
        truck.setMaxSpeed(100);
        truck.setColor("Blue");
        truck.setLoadCapacity(20000);
        session.save(truck);

        session.getTransaction().commit();
        session.close();

        System.out.println("Data saved successfully!");
    }
}
