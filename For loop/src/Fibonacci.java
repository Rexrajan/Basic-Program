import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of times to print fibonacci series: ");
        int num_times = scan.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i = 3; i <= num_times; i++ ){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
