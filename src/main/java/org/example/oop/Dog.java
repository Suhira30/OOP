package org.example.oop;

public class Dog extends Animal{
    String nickname;
    public Dog( String name,String nickname){
        super(name);
        this.nickname = nickname;
    }
    public void bark(){
        System.out.println("dog barking");
    }
    public void eat(){
        System.out.println("dog eating");
    }

}
