import java.util.*;
public class Set_No_of_Elements {
    public static void main(String[] args) {
        HashSet<Integer> hashInteger = new HashSet<>();
        hashInteger.add(34);
        hashInteger.add(50);
        hashInteger.add(100);
        hashInteger.add(30);

        System.out.println(No_Of_Elements(hashInteger));

    }

    public static int No_Of_Elements(HashSet<Integer> value) {
        int elements = value.size();
        return elements;
    }

}
