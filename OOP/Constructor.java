import java.util.*;

public class Constructor{

public static void main(String args[]){
    Const s1 = new Const();
    Const s2 = new Const(33);
    System.out.println(s2.rollno);
    Const s3 = new Const("Tanmay");
    System.out.println(s3.name);
    Const s4 = new Const(33);
    System.out.println(s4.rollno);
}
}

class Const{
    String name;
    int rollno;
    
    //Default/ non-Parameterised Constructor
    Const(){
        System.out.println("Tanmay");
    }

    //Parameterised Constructor
    Const(int rollno){
        this.rollno = rollno;
    }

    //Parameterised Constructor
    Const(String name){
        this.name = name;
    }
}
