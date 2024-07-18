import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListOddNumbers {
    public static void main(String[] args){
        List<Integer> det = new ArrayList<>();
        det.add(3);
        det.add(5);
        det.add(1);
        det.add(13);
        det.add(69);
        System.out.println(result(det));

    }
    public static String result(List<Integer> lists){
        for(Integer i : lists){
            if (i % 2 == 0)
                return "Any one of value can be odd number";
        }
        return "Every value in list contains even numbers";
    }
}
