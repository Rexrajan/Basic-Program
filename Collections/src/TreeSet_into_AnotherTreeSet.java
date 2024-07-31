import java.util.*;
public class TreeSet_into_AnotherTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeSet1 = new TreeSet<>();

        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet1.add("Ab De Villiers");
        treeSet1.add("Chris Gayle");
        treeSet1.add("Ab De Villiers");
        treeSet1.add("Chris Gayle");
        /*treeSet1.add("Sachin Tendulkar\n");
        treeSet1.add("Rohit Sharma\n");
        treeSet1.add("Hardick Pandiya\n");
        treeSet1.add("Dhoni\n");*/

        set_into_another_set(treeSet1,treeSet2);

       // System.out.println(treeSet1);

    }
    /*public static TreeSet<String> set_into_another_set(TreeSet<String> treeSet1,TreeSet<String> treeSet2){
        treeSet2.add("Helicopter Shot\n");
        treeSet2.add("Mr.360 The Devil\n");
        treeSet2.add("Master Blaster\n");
        treeSet2.add("The Universal Boss\n");
        treeSet2.add("Pull Shot\n");
        treeSet2.add("T20 Specialist\n");

        treeSet1.addAll(treeSet2);
        return treeSet1;
    }*/
    public static void set_into_another_set(TreeSet<String> treeSet1,TreeSet<String> treeSet2){

        treeSet2.addAll(treeSet1);
        System.out.println(treeSet2);

    }

}
