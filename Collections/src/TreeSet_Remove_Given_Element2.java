import java.util.Scanner;
import java.util.TreeSet;

public class TreeSet_Remove_Given_Element2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(45);
        treeSet.add(29);
        treeSet.add(10);
        treeSet.add(100);
        treeSet.add(97);
        treeSet.add(65);
        treeSet.add(461);
        treeSet.add(350);
        System.out.println(treeSet);
        System.out.print("Enter the value to remove from above list: ");
        Integer number = scan.nextInt();
        System.out.println(Remove(treeSet,number));
    }
    public static TreeSet<Integer> Remove(TreeSet<Integer> tree, Integer num){
            tree.remove(num);
            return tree;

    }
}
