import java.util.ArrayList;
//TWO POINTER APPROACH
public class PairSum1new {
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;

        while (lp != rp) {
            //case1
                if(list.get(lp) + list.get(rp) == target){
                    return true;
                }
            //case2    
                if(list.get(lp) + list.get(rp) < target){
                    lp++;
                }
            //case3
                if(list.get(lp) + list.get(rp) > target){
                    rp--;
                }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        int target = 13;
        System.out.println(pairSum2(list, target));
    }
}
