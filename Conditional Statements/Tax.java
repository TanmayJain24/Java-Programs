import java.util.*;

public class Tax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int tax;
        if(x<500000){
            tax=0;
            System.out.println("NO NEED TO PAY INCOME TAX: ");
        }
        else if(x>=500000 && x<1000000){
            tax =(int) (x*0.2);
            System.out.println("NEED TO PAY 20% INCOME TAX: ");
        }
        else{
            tax =(int) (x*0.3);
            System.out.println("NEED TO PAY 30% INCOME TAX: ");
        }
        System.out.println("YOUR TAX IS: " + tax);
    }
}