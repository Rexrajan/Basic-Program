import java.util.*;
public class LinkedList_Reversed {
    public static void main(String [] args){
        LinkedList<String> stringArray = new LinkedList<>();
        stringArray.add("Infenta");
        stringArray.add("Leo Doss");
        stringArray.add("Rex Doss");
        stringArray.add("Roseline Doss");
        System.out.println("Before Reverse: "+stringArray);

        System.out.print("After Reversed: ");
        /*for (int i = stringArray.size() - 1; i >= 0; i --){
            System.out.print(stringArray.get(i));
        }*/

        ListIterator<String> i = stringArray.listIterator(stringArray.size());
        while(i.hasPrevious()){
            System.out.print(i.previous()+ ", ");
        }
    }
}
