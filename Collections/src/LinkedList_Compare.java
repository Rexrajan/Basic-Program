import java.util.*;
public class LinkedList_Compare {
    public static void main(String [] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("e");
        list1.add("i");
        list1.add("o");
        list1.add("u");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("e");
        list2.add("i");
        list2.add("o");
        list2.add("u");

        System.out.println(list2);

        if (list1.equals(list2)){
            System.out.println("Both lists are same elements");
        }
        else System.out.println("Both list are different");
    }
}
