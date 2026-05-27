package org.example.oop.Polymorphism;

public class Calculator {
    //Method overloading: Method signature differ
    /*
    Method Signature = method name+list of parameter
    In Method Overloading name does not change but list of parameter differ
     */

    public int addNumber(int a, int b) {
        //method signature addnumber(int,int)
        System.out.println("Adding integer");
        return a+b;
    }
    public int  addNumber(int a, int b,int c) {
        //method signature addnumber(int,int,int)
        System.out.println("Adding 3 integer");
        return a+b+c;
    }

    public  double addNumber(double a, double b) {
        //method signature addnumber(double,double)
        System.out.println("Adding Double");
        return a+b;
    }

}
