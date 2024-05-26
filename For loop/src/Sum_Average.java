import java.util.*;
public class Sum_Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++){
            System.out.print("Enter Number "+i+": ");
            int num = scan.nextInt();
            sum = sum + num;
        }
        double aver = sum;     //because average may be in decimal value
        System.out.println("The sum is: "+sum);
        System.out.println("Average is: "+aver/5);
    }
}
