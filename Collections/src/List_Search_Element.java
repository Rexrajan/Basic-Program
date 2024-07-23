import java.util.*;
public class Search_Element {
    public static void main(String[] args) {
        Scanner getvalue = new Scanner(System.in);
        ArrayList<Integer> element = new ArrayList();
        element.add(45);
        element.add(100);
        element.add(11);
        element.add(4);
        element.add(33);
        element.add(56);

        System.out.print("Enter an element to search in the list: ");
        Integer num  = getvalue.nextInt();
        if (element.contains(num)){
            System.out.println(num + " is found in given list");
        }
        else {
            System.out.println(num + " is not found in the given list");
        }
    }
}
