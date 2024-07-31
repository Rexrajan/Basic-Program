import java.util.*;
public class Remove_Duplicate {
    public static void main(String[] args){
        Remove_Duplicate obj = new Remove_Duplicate();
        obj.method1();
    }
    public void method1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of fixing elements: ");
        int element = scan.nextInt();

        int [] arr = new int[element];
        System.out.print("Enter the values you want: ");

        for(int i = 0; i < arr.length; i = i + 1){
            arr[i] = scan.nextInt();
        }

        System.out.println("Your entered values in the array are");
        for(Integer i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\nAfter removing duplicate values in the array are");
        int visited = -1;

        for(int i = 0; i < arr.length; i++){
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        arr[j] = visited;
                }
                System.out.print(arr[i] + " ");
            }
        }

    }
}
