import java.util.*;
public class UnaryReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //To only print number:
        // int n = 998765;
        // while(n > 0){
        //     int i = n % 10;
        //     System.out.print(i);
        //     n = n / 10;
        // }

        //To output reversed number:
        int n = 987654321;
        int rev = 0;
        while(n > 0){
            int i = n % 10;
            rev = (rev * 10) + i;
            n = n / 10;
        }
        System.out.println(rev);
        System.out.println();
    }
}