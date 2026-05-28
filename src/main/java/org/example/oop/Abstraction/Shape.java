package org.example.oop.Abstraction;

abstract class Shape {
int id;
public void display(){
    System.out.println("Shape::display()");
}
public void color(){
    System.out.println("Shape::color()");
}
abstract void draw();

}
