import java.util.*;
//Single level Inheritance
class Inheritance1{
public static void main(String args[]){
    Dog a = new Dog();
    a.breath();
    a.walk();
    a.smell();
    a.run();
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
        System.out.println("Dogs have run on 4 legs");
    }
}

















