package org.example.oop.Interface;

public interface Vehicle {

    //Constant
    int speed = 100;

    //abstract method
    void hasAc();

    //Static method
    static void useFuel() {
        System.out.println("Fuel available");
    }

    //Default method
    default void stop() {
        System.out.println("Stopped");
    }

    default void display() {
        System.out.println("Vehicle Display");
    }
}
