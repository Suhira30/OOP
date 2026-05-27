package org.example.oop.Inheritance;

public class Dog extends Animal{
    String nickname;
    public Dog( String name,String nickname){
        super(name);
        this.nickname = nickname;
    }
    public void bark(){
        System.out.println("dog barking");
    }

    //Over ridding || Late binding || Dynamic Binding || Related to inheritance || maintain method signature
    public void eat(){
        System.out.println("dog eating");
    }//Over ridding

}
