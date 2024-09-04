import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(13);
        list.add(12);
        list.add(33);
        list.add(44);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);//Ascending
        System.out.println(list);

        //Descending
        Collections.sort(list, Collections.reverseOrder());
        //Comparators - fnx logic
        System.out.println(list);
    }
}
