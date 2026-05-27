package org.example.oop.Inheritance;

public class Car extends Vehicle {

    String model;
    String color;

    public Car() {
        super();
// this no arg constructor internally call super() -> this super() call no arg constructor of parent
    }

    public void honk() {
        System.out.println("car honk");
    }
}
