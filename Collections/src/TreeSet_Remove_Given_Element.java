import java.util.*;
public class TreeSet_Remove_Given_Element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> treeSet = new TreeSet<>();
        TreeSet<String> dummy = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("pineapple");
        treeSet.add("grapes");
        treeSet.add("banana");
        treeSet.add("guava");
        treeSet.add("pomegranate");
        treeSet.add("jackfruit");
        treeSet.add("beetroot");
        System.out.println(treeSet);
        System.out.print("Enter the value to remove from above list: ");
        String name = scan.next();
        System.out.println(Remove(treeSet,name,dummy));
    }
    public static TreeSet<String> Remove(TreeSet<String> tree, String name,TreeSet<String> dummy){
        if (tree.contains(name)) {
            tree.remove(name);
            return tree;
        }
        else{
            dummy.add("You entered value is not in the list");
            return dummy;
        }
    }
}
