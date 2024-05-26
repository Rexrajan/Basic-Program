import java.util.*;
public class Reverse_Digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int actual_num = input.nextInt();
        int num = actual_num;
        int rev = 0;
        for(int i = 1; num > 0; i++){
            int mod = num % 10;
            rev = rev * 10 + mod;
            num = num / 10;
        }
        System.out.println("Reverse of the "+actual_num+" is "+rev);
    }
}
