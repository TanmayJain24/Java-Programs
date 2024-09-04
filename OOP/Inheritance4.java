import java.util.*;
//Heirarchical Inheritance
public class Inheritance4 {
    public static void main(String args[]){
    Cat b = new Cat();
    b.breath();
    b.walk();
    b.sleep();
    b.eat();
    System.out.println();

    Dog d = new Dog();
    d.breath();
    d.walk();
    d.smell();
    d.run();
    System.out.println();

    Kitty k = new Kitty();
    k.Cute();
    k.sleep();
    k.eat();
    k.breath();
    k.walk();

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

class Cat extends Animal{
    void sleep(){
        System.out.println("Cats can Sleep");
    }
    void eat(){
        System.out.println("Cats can Eat");
    }
}

class Kitty extends Cat{
    void Cute(){
        System.out.println("Kitty is very Cute");
    }
}