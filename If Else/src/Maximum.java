import java.util.*;
public class Maximum{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an Number1: ");
        int num1 = inp.nextInt();
        System.out.print("Enter an Number2: ");
        int num2 = inp.nextInt();

        if (num1>num2)
            System.out.println("Number1 is greater than Number2");
        else
            System.out.println("Number2 is greater than Number1");
    }
}
