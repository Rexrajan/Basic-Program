import java.util.*;
public class Set_Append {
    public static void main(String[] args){
        HashSet<Long> hashSet = new HashSet<>();
        hashSet.add(45L);
        hashSet.add(11L);
        hashSet.add(23L);
        hashSet.add(50L);
        hashSet.add(33L);
        hashSet.add(100L);
        System.out.println(adding_Element(hashSet));



    }
    public static HashSet<Long> adding_Element(HashSet<Long> pass_ref){
        Long new_value = Long.valueOf(53238570);
        pass_ref.add(new_value);
        return pass_ref;
    }
}
