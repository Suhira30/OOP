package org.example.oop.Polymorphism;

public class Demo {
public static void main(String[] args) {
    //Method OverLoading: Compile-time polymorphism || Early Binding || Static binding
    System.out.println("-------------Over loading--------------");
    Calculator calculator = new Calculator();
    System.out.println("Adding 2 integer: "+calculator.addNumber(1,2));
    System.out.println("Adding 3 integer :" +calculator.addNumber(4,9,8));
    System.out.println("Adding 2 double :" +calculator.addNumber(4.0,9.0));

    //Over ridding || Late binding || Dynamic Binding || Related to inheritance || maintain method signature
    System.out.println("-------------Over ridding--------------");
    SavingAccount savingAccount = new SavingAccount();
    savingAccount.display();
    //Dynamic Method Dispatch: Java decide method during runtime
    Account a = new SavingAccount();
    a.display();
}
}
