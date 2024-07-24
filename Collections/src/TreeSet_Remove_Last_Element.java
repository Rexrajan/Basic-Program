import java.util.*;
public class TreeSet_Remove_Last_Element {
    public static void main(String[] args) {
        TreeSet<Integer> integers = new TreeSet<>();
        integers.add(56);
        integers.add(23);
        integers.add(12);
        integers.add(50);
        integers.add(2);

        System.out.println(remove_last2(integers));
    }
    public static TreeSet<Integer> remove_last(TreeSet<Integer> integers){
        System.out.println("Last Element is: "+integers.last());
        integers.pollLast();
        return integers;
    }
    public static TreeSet<Integer> remove_last2(TreeSet<Integer> integers){
        System.out.println("Last Element is: "+integers.last());
        Integer last_elem = integers.last();
        integers.remove(last_elem);
        return integers;
    }
}
