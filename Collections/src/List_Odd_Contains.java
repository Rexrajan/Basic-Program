import java.util.*;
public class List_Odd_Contains {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(100);
        arrlist.add(22);
        arrlist.add(4);
        arrlist.add(88);
        arrlist.add(90);
        boolean output = check(arrlist);
        System.out.println(output);

    }
    public static boolean check(ArrayList<Integer> arr){
        for ( int i = 0; i < arr.size(); i++){
            if (arr.get(i) % 2 != 0)
                return true;
        }
        return false;
    }
}
