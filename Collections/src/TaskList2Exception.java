import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TaskList2Exception {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(;;){
            System.out.print("Enter an number: ");
           try{
               Integer num = scan.nextInt();
               arrayList.add(num);
           }
           catch (Exception e){
               break;
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
