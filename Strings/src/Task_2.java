import java.util.*;
public class Task_2 {
    public static void main(String[] args){
        String old_value = "$9.99";
        String arr [] = old_value.split("\\$");
        System.out.println(arr[1]);

        String new_value = Arrays.toString(arr);
        //System.out.println(new_value);
    }
}
