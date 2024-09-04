import java.util.*;
//Multilevel Inheritance
class Inheritance2 {
    public static void main(String args[]){
    Cat b = new Cat();
    b.breath();
    b.walk();
    b.smell();
    b.run();
    b.sleep();
    b.eat();

}
}

class Animal{
    void breath(){
        System.out.println("Animals can Breath");
    };
    void walk(){
        System.out.println("Animals can Walk");  
    };
}

class Dog extends Animal{
    void smell(){
        System.out.println("Dogs can Smell");
    }
    void run(){
        System.out.println("Dogs can run on 4 legs");
    }
}

class Cat extends Dog{
    void sleep(){
        System.out.println("Cats can Sleep");
    }
    void eat(){
        System.out.println("Cats can Eat");
    }
}


















