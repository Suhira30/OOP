package org.example.oop.Encapsulation;

public class Demo {
    public static void main(String[] args) {
        //Method Using setter set values---------
        Employee emp  = new Employee();
//        System.out.println(emp.id); --> id is private We can not call like this
        emp.setId(1);
        System.out.println(emp.getId());
        emp.setFirstName("Jack");
        System.out.println("-----------method 1: Using getter and setter ---------------");
        System.out.println(emp.getFirstName());
        System.out.println(emp.getLastName()); // default value will print

        //update
        emp.setFirstName("joo");
        System.out.println(emp.getFirstName());

        // Method 2: Using constructor set values
        System.out.println("-----------method 2-: Using constructor set values ------------");
        Employee emp2 = new Employee(2,"Suhi","Bala");
        System.out.println(emp2);// this print object address which is stored in stack
        System.out.println("Id: " +emp2.getId());
        System.out.println("FirstName: "+emp2.getFirstName());
        System.out.println("LastName: "+emp2.getLastName());

    }

}
