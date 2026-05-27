package org.example.oop;
public class OOPApplication {

    public static void main(String[] args) {
        Dog dog = new Dog("Puppy","DODO");
        System.out.println("Name of the dog:" +dog.name);
        System.out.println("NickName of the dog:" +dog.nickname);
        dog.bark();
        dog.eat();
        dog.sleep();
    }

}
/*
Java code(.java) -> compile -> (.class)-> JVM (byte code) -> machine code
IN JVM:
1.class, each class methods and constructors :loaded in Method Area/MetaSpace
    just method definition ,execution step is not in here
        OOPApplicaton.class -->method
        Dog.class --> field,methods , constructors
        Animal.class  --> field,methods and constructor

2. main method added in stack
    Each method added to stack for execution after execution finish those will remove

3. object creation
    Dog dog=new Dog("puppy","DODO");
    1.1 in heap object created
    1.2 allocate memory for instance variables
        here, Dog is subclass therefore
        a single object single memory space but 2 separate parts one for Animal, another for Dog
    1.3 set default values automatically by JVM

        visualization:
                    Dog Object in Heap
            --------------------------------
            Animal part:
                name = null

            Dog part:
                nickName = null
            --------------------------------
4. call constructor
        public Dog( String name,String nickname){
        super(name);
        this.nickname = nickname;
       }
        1.1  Dog dog=new Dog("puppy","DODO") two arg constractor will call from Dog class
        1.2  super(String name) : JVM call parent constructor
                 public Animal(String name){
                 this.name=name;
                }
        1.3 name initialization
        1.4 continue with dog constructor
            this.nickname=nickname;
            nickname initialization
        1.5  constructor calling over

5. Reference saved in Stack
    visualization;
        STACK:
            --------------------------------
            main()
              dog → reference
            --------------------------------

         HEAP:
            --------------------------------
            Dog object
              name = "puppy"
              nickName = DODO
            --------------------------------
6.dog.bark()
    1.1 check the object reference/ runtime type = DOG
    1.2 Go to Dog Metadata /method Area space
    1.3 find bark() method
    1.4 bark()method added to stack
            STACK:
                --------------------------------
                bark() frame
                main() frame
                --------------------------------
    1.4 execute Dog.bark()
    1.5 after execution finished bark() removed
                  STACK:
                --------------------------------
                main() frame
                --------------------------------
7. dog.eat()
    1.1 check the object reference/ runtime type = DOG
    1.2 Go to Dog Metadata /method Area space
    1.3 find eat() method
    1.4 execute Dog.eat()

8. dog.sleep()
    1.1 Runtime type = Dog
    1.2 Search Dog → no sleep()
    1.3 Move to parent Animal
    1.4 sleep() found
    1.5 Execute Animal.sleep()
 */
