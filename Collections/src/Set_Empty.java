import java.util.*;
public class Set_Empty {
    public static void main(String[] args) {
        HashSet<String> qualities = new HashSet<>();
        qualities.add("Calm");
        qualities.add("Be Genuine");
        qualities.add("Humble");
        qualities.add("Be Active");
        qualities.add("Respect Everyone");

        empty(qualities);
        System.out.println(qualities);
    }

    public static void empty(HashSet<String> in_method){

        in_method.clear();
    }
}
