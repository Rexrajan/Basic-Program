import java.util.*;
public class Unique_List {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(45);
        arrayList.add(23);
        arrayList.add(11);
        arrayList.add(23);
        arrayList.add(70);
        arrayList.add(90);
        arrayList.add(11);

        System.out.println("With Duplicate values: "+arrayList);

        ArrayList<Integer> distinctlist = new ArrayList();

        for ( int i = 0; i < arrayList.size(); i ++){
            if (! distinctlist.contains(arrayList.get(i))) {
                distinctlist.add(arrayList.get(i));
            }
        }
        System.out.println("Without Duplicate values: "+distinctlist);
        System.out.println(Unique_List.i);
    }
     static int i;
}
