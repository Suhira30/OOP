package org.example.oop.Encapsulation;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;

    public Employee(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /*
    When we define parameterized constructor then
    we have to define no arg constructor because we made a call Employee emp =new Employee
    because this need no arg constructor
    if don't define any constructor no need to define no arg constructor also
    because JVM internally call no arg constructor
     */
    public Employee() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
