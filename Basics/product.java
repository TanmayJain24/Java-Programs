import java.util.*;
public class product{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TWO NUMBERS TO MULTIPLY: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);
    }
}