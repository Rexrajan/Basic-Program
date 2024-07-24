import java.util.*;
public class TreeSet_Iterate {
    public static void main(String[] args) {
        TreeSet<String> treeString = new TreeSet<>();
        treeString.add("Sachin Tendulkar");
        treeString.add("Pat Cummins");
        treeString.add("Steyn");
        treeString.add("Ab De Villiers");
        treeString.add("Chris Gayle");
        treeString.add("Rohit Sharma");
        loop_Over_Set(treeString);

    }
    public static void loop_Over_Set(TreeSet<String> iterate){
        for (String i : iterate){
            System.out.println(i);
        }
    }
}
