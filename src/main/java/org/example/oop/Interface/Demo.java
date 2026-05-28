package org.example.oop.Interface;

//Interface is not OOP concept but it need to achieve multiple inheritance
public class Demo {

    public static void main(String[] args) {

        //abstract method and default method
        Car car = new Car();
        car.hasAc();
        car.stop();


        //Static method belongs to interface , that's not inherited to child class
        Vehicle.useFuel();
        System.out.println("Speed: " + Vehicle.speed);

        /*
        Interface constants are NOT inherited into objects
        They are statically accessed shared values
         */
        System.out.println("Speed: " + Vehicle.speed);
    }
}
