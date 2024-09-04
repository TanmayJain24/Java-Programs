import java.util.*;
//Single level Inheritance
class MethOverridding{
public static void main(String args[]){
    Dog a = new Dog();
    a.walk();
    }   
}


class Animal{
    void walk(){
        System.out.println("Animals can Walk");//will not displayed at the time of calling
    };
}

class Dog extends Animal{
    void walk(){
        System.out.println("Dogs can walk on 4 legs");//Method Overriding(same function name but different defination)
    };
}