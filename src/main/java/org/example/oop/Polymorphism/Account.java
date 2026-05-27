package org.example.oop.Polymorphism;

public class Account {

    int accountNumber;
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void display() {
        System.out.println("Account");
    }
}
