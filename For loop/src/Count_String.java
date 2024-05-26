import java.util.Scanner;

public class Count_String {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a any value: ");
        String name = input.nextLine();
        String reverse = "";
        int count = 0;
        for (int i = name.length() - 1; i >= 0; i--){
            reverse = reverse + name.charAt(i);
            count = count + 1;
        }
        System.out.println("Count of string "+count);
    }
}
