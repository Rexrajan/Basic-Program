
import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine();
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--){
            reverse = reverse + name.charAt(i);
        }
        System.out.println("Reverse of the name is "+reverse);
    }
}
