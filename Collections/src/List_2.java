import java.util.*;
public class List_2 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(56);
        arr.add(22);
        arr.add(90);
        arr.add(12);
        arr.add(5);
        arr.add(80);
        arr.set(3,22);
        System.out.println(arr.contains(80));
        System.out.println(arr.get(3));


    }
}
