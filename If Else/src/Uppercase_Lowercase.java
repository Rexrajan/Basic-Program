/*Write a program to check whether a character is uppercase or lowercase alphabet*/
import java.util.*;
public class Uppercase_Lowercase {
    public static void main(String arg []){
       Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
       char character = input.next().charAt(0);

       if ( character >= 'a' && character <= 'z'){
           System.out.println("You Entered character is lowercase");
       }
       else if ( character >= 'A' && character <= 'Z'){
           System.out.println("You Entered character is Uppercase");
       }
    }

}
