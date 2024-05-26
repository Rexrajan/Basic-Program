import java.util.Scanner;
public class Reverse_String {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter an name: ");
        String name = new String(get.nextLine());
        String reverse_name = "";
        for (int i = name.length() - 1; i >= 0; i--)
           reverse_name = reverse_name + name.charAt(i);
        System.out.println(reverse_name);
    }
}
