import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Iterate2 {
    public static void main(String[] args) {
        TreeSet<String> treeString = new TreeSet<>();
        treeString.add("Sachin Tendulkar");
        treeString.add("Pat Cummins");
        treeString.add("Steyn");
        treeString.add("Ab De Villiers");
        treeString.add("Chris Gayle");
        treeString.add("Rohit Sharma");

        Iterator<String> iterator = treeString.iterator();

        iterate_Over_Set(iterator);
    }
    public static void iterate_Over_Set(Iterator<String> i){
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
