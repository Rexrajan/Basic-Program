import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an natural number: ");
        int sum = 0;
        int natural_num = scanner.nextInt();
        for(int i = 1; i <= natural_num; i++ )
            sum = sum + i;
        System.out.println("Sum of the given natural numbers are: "+sum);
    }
}
