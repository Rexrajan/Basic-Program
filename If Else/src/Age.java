import java.util.*;
public class Age {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter an age: ");
        int ticket = enter.nextInt();

        if (ticket > 60)
            System.out.println("Rs 100");
        else if (ticket >= 41)
            System.out.println("Rs 200");
        else if (ticket >= 21)
            System.out.println("Rs 300");
        else if (ticket >= 10)
            System.out.println("Rs 100");
        else System.out.println("Free Ticket");
    }
}
