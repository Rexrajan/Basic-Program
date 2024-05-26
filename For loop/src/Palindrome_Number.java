
import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner get_an_number = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int actual_num = get_an_number.nextInt();
        int num = actual_num;
        int rev = 0;
        for(int i = 1; num > 0; i++){
            int mod = num % 10;
            rev = rev * 10 + mod;
            num = num / 10;
        }
        if(actual_num == rev){
            System.out.println(actual_num+" == "+rev);
            System.out.println("It is a palindrome number");
        }
        else {
            System.out.println(actual_num + " != " + rev);
            System.out.println("Not an palindrome number");
        }
    }
}