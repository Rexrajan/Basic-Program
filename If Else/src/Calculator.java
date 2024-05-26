import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the operation '+','-','*','/'");
        char oper = scanner.next().charAt(0);
        System.out.print("Enter number 2: ");
        double y = scanner.nextDouble();
        if (oper == '+')
            System.out.println(x+y);
        else if (oper == '-')
            System.out.println(x-y);
        else if (oper == '*')
            System.out.println(x*y);
        else if (oper == '/')
            System.out.println(x/y);
        else
            System.out.println("Enter an valid Operation");

    }
}
