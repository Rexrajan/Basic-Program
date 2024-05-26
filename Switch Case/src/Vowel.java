import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a letter to check whether it is vowel or not ");
        char vowel = inp.next().toLowerCase().charAt(0);

        switch (vowel){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(vowel+" is a vowel");
                break;
            default:
                System.out.println(vowel+" is a Consonants");
        }
    }
}
