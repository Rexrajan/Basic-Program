import java.util.*;
public class SumOfNaturalNumbersUsingRecursion {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of natural numbers to sum: ");
        int no_of_natural_numbers = scan.nextInt();

        int output = Sum(no_of_natural_numbers);
        if(output == 0){
            System.out.println("Natural number starts from 1!");
        }
        else System.out.println("Sum of "+no_of_natural_numbers+" is "+output);

    }
    static int Sum(int n){
        if ( n == 1)
            return 1;
        else if ( n == 0){
            return 0;
        }
        else {
            int value = n + Sum(n - 1);
            return value;
        }
    }
}
