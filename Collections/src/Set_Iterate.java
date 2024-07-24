import java.util.*;
public class Set_Iterate {
    public static void main(String[] args) {
        HashSet<String> hash_String = new HashSet<>();
        hash_String.add("Pulsar NS200");
        hash_String.add("MT-15");
        hash_String.add("Honda CBR");
        hash_String.add("KTM Duke 390");

        /*for (String list : hash_String){
            System.out.println(list);
        }*/

        Iterator<String> i = hash_String.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }    // By using iterator class
    }
}
