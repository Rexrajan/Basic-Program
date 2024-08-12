import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number to find factorial: ");
        int input_value = scanner.nextInt();
        int result = fact(input_value);
        System.out.println("The factorial of "+ input_value + " is :"+result);
    }
    public static int fact(int n){
        if ( n == 0 || n == 1)
            return 1;
        else {
            int product = n * fact(n - 1);
            return product;
        }
    }
}
