import java.util.*;

public class SearchMatrix{
    public static boolean staircasesearch(int matrix[][],int key) {
        int row=0,col=matrix[0].length-1;

        while(row < matrix.length && col >=0){
             if(matrix[row][col]==key){
                System.out.println("Found key at ("+row+" , "+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        System.out.println("Key not Found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key=8;
        staircasesearch(matrix,key);       
    }
}