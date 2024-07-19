import java.util.*;
public class TaskList {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(;;){
            System.out.print("Enter an number: ");
            String num = scan.next().toLowerCase();
            if (num.equals("no")){
                break;
            }
            else {
                Integer i = Integer.valueOf(num);
                arrayList.add(i);
            }
        }

        /*while(true){
            System.out.print("Enter an number: ");
            String num = scan.next().toLowerCase();
            if (! (num.equals("no")) ){
                Integer i = Integer.valueOf(num);
                arrayList.add(i);
            }
            else {                              By using while loop
                break;
            }
        }*/

        TreeSet<Integer> treeSet = new TreeSet(arrayList);
        System.out.println(treeSet);

    }
}
