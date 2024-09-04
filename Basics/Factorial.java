import java.util.Scanner;

class Factorial{  
    public static void main(String args[]){  
        int i,fact=1;  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate the Factorial: ");
        int number = sc.nextInt();
        //It is the number to calculate factorial    
        for(i=1;i<=number;i++){    
            fact=fact*i;    
        }    
        System.out.println("Factorial of "+number+" is: "+fact);
    }  
}
