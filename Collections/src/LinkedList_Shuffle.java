import java.util.*;
public class LinkedList_Shuffle {
    public static void main(String[] args){
        LinkedList<Integer> actual_List = new LinkedList<>();
        actual_List.add(4);
        actual_List.add(40);
        actual_List.add(100);
        actual_List.add(400);

        Collections.shuffle(actual_List);

        System.out.println(actual_List);
    }
}
