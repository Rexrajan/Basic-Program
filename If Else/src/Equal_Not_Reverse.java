import java.util.*;
public class Equal_Not_Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an number: ");
        long num = scan.nextInt();
        long Actual_input = num;
        long rev_num = 0;
        for (int i = 1; num > 0; i++) {
            long mod = num % 10;
            rev_num = (rev_num * 10) + mod;
            num = num / 10;
        }
        if (Actual_input == rev_num)
            System.out.println("EQUAL");
        else
            System.out.println("Not Equal");
    }
}
