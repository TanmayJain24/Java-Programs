import java.util.*;
public class Pairs{
    public static void pairs(int numbers[]) {
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+") ");
            }
            System.out.println();
        } 

    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        pairs(numbers);

    }
}