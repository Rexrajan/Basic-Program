import java.util.*;
public class Sign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = input.nextInt();

        if (number > 0)
            System.out.println("The given number is Positive");
        else if (number < 0)
            System.out.println("The given number is Negative");
        else
            System.out.println("NEUTRAL!!!!");
    }
}
