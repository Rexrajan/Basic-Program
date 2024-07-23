import java.util.ArrayList;
import java.util.Collections;

public class Shuffle_Element {
    public static void main(String[] args) {
        ArrayList<String> prev_list = new ArrayList<>();
        prev_list.add("apple");
        prev_list.add("banana");
        prev_list.add("grapes");
        prev_list.add("guava");
        prev_list.add("pomegranate");
        System.out.println("Before shuffle:");
        for (String fruits : prev_list){
            System.out.println(fruits);
        }

        Collections.shuffle(prev_list);

        System.out.println("After shuffle:");
        for ( int i = 0; i < prev_list.size(); i ++){
            System.out.print(prev_list.get(i) + " ");
        }
    }
}
