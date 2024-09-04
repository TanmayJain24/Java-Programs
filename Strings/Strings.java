import java.util.*;
public class Strings{
    public static void printletters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name,Fullname,name1;
        System.out.println("Hello,Please enter your first name");
        name=sc.nextLine();
        System.out.println("Please enter your surname");
        name1=sc.nextLine();
        System.out.println("Your full name is: "+name+" "+name1);
        System.out.println("length of name: "+name.length());
        System.out.println(name.charAt(0));
        Fullname=name+" "+name1;
        System.out.println(Fullname);
        printletters(Fullname);


    }
}