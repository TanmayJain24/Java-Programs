import java.util.*;
public class Days{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NUMBER: ");
    int n = sc.nextInt();

    if(n == 2){
        System.out.println("NUMBER IS PRIME: ");
    }
    else{
        boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
            }
    }
    if(isPrime == true){
        System.out.println("n IS PRIME: " + n);
    }
    else{
        System.out.println("n IS NOT PRIME: "+ n);
        }
    }
}
}