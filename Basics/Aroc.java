import java.util.*;
public class Aroc{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE RADIUS OF CIRCLE: ");
    double r = sc.nextFloat();
    double pi = 3.14;
    double AC = pi * r * r;
    System.out.println("THE AREA OF CIRCLE IS: "+AC);
    }
}