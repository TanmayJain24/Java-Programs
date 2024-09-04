import java.util.*;

class Abstract{
//Abstraction just gives idea about the method/function() but implementation is given in other function().

public static void main(String args[]){
    Horse h = new Horse();
    h.eat();
    h.walk();
    System.out.println(h.color);

    System.out.println();

    Ostrich o = new Ostrich();
    o.eat();
    o.walk();
    System.out.println(o.color);
    }   
}

abstract class Animal{
    //abstract class dont have there objects but still they can create the constructors which only used for initialisation.
    String color;
    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("Animals can Eat");
    }

    abstract void walk();
}
class Horse extends Animal{
    void changeColor() {
        color = "dark brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs ");
    }
}

class Ostrich extends Animal{
    void walk(){
    System.out.println("Walks on 2 legs ");
    }
}