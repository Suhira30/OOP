package org.example.oop.Abstraction;

public class Circle extends Shape {
String radius;

    @Override
    void draw() {
        System.out.println("Circle draw");
    }

    //override
    public void color(){
        System.out.println("circle color");
    }
}
