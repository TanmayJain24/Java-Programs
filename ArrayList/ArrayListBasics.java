import java.util.ArrayList;
import java.util.*;

public class ArrayListBasics {
    public static void main(String[] args) {
        //Classname objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //Add Operation - //O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // list.add(1,9); //O(n)

        // System.out.println(list);

        // //Get Operation - O(1)
        // int element = list.get(2);
        // System.out.println(element);

        // //Delete Operation - O(n)
        // list.remove(2);
        // System.out.println(list);

        // //Set Operation - O(n)
        // list.set(2,10);
        // System.out.println(list);

        // //Contains Operation - O(n)
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));

        // //Size Function
        // //arr.length - a Property to find length 
        // System.out.println(list.size());
        // //size() is a Function to find length 

        // //Print ArrayList
        // for(int i=0; i<list.size(); i++){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        // //Reverse print
        // for(int i=list.size()-1; i>=0; i--){
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();

        //Find Maximum in a ArrayList - O(n)
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            // if(max < list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));//Alternative
        }
        System.out.println("Maximum Element is = "+max);
    }
}