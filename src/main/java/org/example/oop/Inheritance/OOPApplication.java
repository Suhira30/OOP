package org.example.oop.Inheritance;
public class OOPApplication {

    public static void main(String[] args) {
        //Inheritance : Dog dog = new Dog("Puppy","DODO");
        Dog dog = new Dog("Puppy", "DODO");
        System.out.println("Name of the dog:" + dog.name);
        System.out.println("NickName of the dog:" + dog.nickname);
        dog.bark();
        dog.eat();
        dog.sleep();

        //Inheritance :Animal d = new Dog("John", "Jo");  ==>>> Upcasting
        System.out.println("----------------Exploring Reference type object creation-------------");
        Animal d = new Dog("John", "Jo");
        System.out.println("Name of the dog:" + d.name);
        //System.out.println("NickName of the dog:" + d.nickname);
        // d.bark();//Compilation error
        d.eat();
        d.sleep();


        //Super
        System.out.println("------------------------Exploring Super()------------------------");
        Car car = new Car();
        /*
        1. constructor not define
            1. JVM call no arg constructor of Car internally
                public Car(){
                super(); // child no arg constructor always having super() -> super() call parent's no arg constructor
                }
         2. Define No Arg constructor in child
            public Car() {
            // this no arg constructor internally call super() -> this super() call no arg constructor of parent
            }
         3. Add parameterized constructor to parent
            we have to create the NO arg constructor (if we are going to deal anything without parameter ,otherwise-> Compile error)

         4. explicitly we can call super
            Super("Honda")
         */
        System.out.println("Car color:" + car.color + " Car model: " + car.model);
        System.out.println("Car brand:" + car.brand + " Car speed: " + car.speed);
        car.honk();
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

//----------------------------------------------------------------------------------------------------------------------------------
/*
 //Inheritance : Animal d = new Dog("Puppy","DODO");  ==>>> Upcasting
        System.out.println("----------------Exploring Reference type object creation-------------");
        Animal d = new Dog("John", "Jo");
        System.out.println("Name of the dog:" + d.name);
        //System.out.println("NickName of the dog:" + d.nickname);
        // d.bark();//Compilation error
        d.eat();
        d.sleep();

1. Class Loading
2. methods , constructor added to METHOD AREA
3. object creation
    Animal d = new Dog("John", "Jo");
    1.1 Heap allocation
        Dog object in heap:
        ---------------------
        name = null
        nickName = null
        ---------------------
    1.2 constructor calling
         1.2.1 super()
         1.2.2 further Dog constructor
    1.3 reference d (Animal type) added in stack

4. d.bark()
    Metadata checking :
        Animal has no bark() //Compilation error *******
5. dog.eat()
      Step 1 — compiler check
        reference type = Animal
        so looks in Animal class
        eat() exists ✔
      Step 2 — runtime dispatch
        JVM checks actual object type: Object = Dog
        Dog.eat()
        output : dog eat
6. dog.run()
    Step 1 — compile time:
        Animal has run() ✔
    Step 2 — runtime:
        Dog does NOT override run()
        Animal.run()
        output: run

 */