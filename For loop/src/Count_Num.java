import java.util.*;
public class Count_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number to count the digits: ");
        long num = scanner.nextLong();
        long count = 0;
        for (int i = 1; num > 0; i++ ) {
            long mod = num % 10;
            count = count + 1;
            num = num / 10;
        }
        System.out.println("The no of digits are: "+count);
    }
}
