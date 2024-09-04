    import java.util.*;
    public class ArrayMaxMin{
        public static int getlargest(int numbers[]){
            int largest = Integer.MIN_VALUE; //Integer.MIN_VALUE Indicates -infinity in JAVA
            int smallest = Integer.MAX_VALUE;
            for(int i=0;i<numbers.length;i++){
                if(largest<numbers[i]){
                    largest = numbers[i];
                }
                if(smallest>numbers[i]){
                    smallest = numbers[i];
                }
       
            }
            System.out.println("THE SMALLEST NUMBER IS: "+ smallest);
        return largest;
        }    
        public static void main(String args[]) {
            int numbers[]={1,10,20,3,14,17};
            System.out.println("THE LARGEST NUMBER IS: " + getlargest(numbers));
        }
    }
