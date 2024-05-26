import java.util.*;
public class Sort_Array {
    public static void main(String[] args) {
        int [] x = {34,22,55,9,19,-3,-500,102,78};
        //Since arrays are not print directly so that arrays are converted to strings which
        //to print the elements.
        String stringarray = Arrays.toString(x);
        System.out.println("Before Sorting: "+stringarray);
        Arrays.sort(x);
        System.out.println("After Sorting: "+Arrays.toString(x));
    }
}
