import java.util.*;
public class Remove_Duplicate_List {
    public static void main(String[] args){
        method();
    }
    public static void method(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values which you want until you say enough: ");
        List<Integer> li = new ArrayList();
        for(;;){
            try{
                Integer num = sc.nextInt();
                li.add(num);
            }
            catch(InputMismatchException e){
                break;
            }
        }

        System.out.println("Entered values are: "+li);
        Integer replace = -1;
        System.out.println("\nAfter removing duplicate values: ");
        for (int i = 0; i < li.size(); i++){
            if( ! li.get(i).equals(-1) ){
                for (int j = i + 1; j < li.size(); j++){
                    if( li.get(i).equals(li.get(j)) ){
                        li.set(j,replace);
                    }
                }
                System.out.print(li.get(i) + " ");
            }
        }
    }
}
