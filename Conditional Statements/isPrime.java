import java.util.*;
public class isPrime{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num % 2 == 0){
        System.out.println("THE NUMBER IS PRIME: "+num);
    }
else{
    System.out.println("THE NUMBER IS ODD: "+num);
}
}
}
