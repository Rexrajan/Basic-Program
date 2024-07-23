import java.util.ArrayList;
public class Copy_One_List_Another_List {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add(33);
        list1.add(45.67d);
        list1.add("Rex");
        list1.add('A');

        ArrayList list2 = new ArrayList();
        list2.addAll(list1);
        System.out.println(list2);
    }
}
