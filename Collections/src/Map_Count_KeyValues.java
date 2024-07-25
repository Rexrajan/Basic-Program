import java.util.*;
public class Map_Count_KeyValues {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Rock");
        hashMap.put(3,"Rex");
        hashMap.put(5,"Infenta");
        hashMap.put(7,"Doss");
        hashMap.put(9,"Roseline");

        System.out.println(hashMap.size());
        System.out.println(hashMap.entrySet().size());

    }
}
