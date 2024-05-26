
import java.util.Scanner;
public class Palindrome_String {
    public static void main(String[] args) {
        Scanner get_value = new Scanner(System.in);
        System.out.print("Enter an any name: ");
        String actual_string = get_value.nextLine();
        String rev_String = "";
        for (int i = actual_string.length() - 1; i >= 0; i--){
            rev_String = rev_String + actual_string.charAt(i);
        }
        if(actual_string.equals(rev_String)){
            System.out.println(actual_string+" == "+rev_String);
            System.out.println("It is a palindrome value");
        }
        else {
            System.out.println(actual_string + " != " + rev_String);
            System.out.println("Not an palindrome value!!!");
        }
    }
}