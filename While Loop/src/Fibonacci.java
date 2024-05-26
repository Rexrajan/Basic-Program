import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of times: ");
        int num_times = scanner.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int initial = 3;
        while( initial <= num_times){
            int c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
            initial = initial + 1;
        }
    }
}
