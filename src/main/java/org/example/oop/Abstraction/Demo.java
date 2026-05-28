package org.example.oop.Abstraction;

public class Demo {
public static void main(String[] args) {
    Shape shape = new Circle();
    shape.draw();
    shape.color();
    shape.display();
    System.out.println(shape.id);

    Circle circle = new Circle();
    circle.draw();
    circle.color();
    circle.display();
    System.out.println(circle.id);
    System.out.println(circle.radius);
}
}
