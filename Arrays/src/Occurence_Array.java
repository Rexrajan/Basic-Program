import java.util.*;
public class Occurence_Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no to check how many times occured in array: ");
        int tar = scan.nextInt();
        int [] x = {3,5,2,7,2,2,9,11};
        int times = 0;
        for( int i = 0; i < x.length - 1; i++){
            if(x[i] == tar)
                times = times + 1;
        }
        System.out.println("No of Occurence of "+tar+" is :"+times);
    }
}
