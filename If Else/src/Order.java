import java.util.*;
public class Order {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an number1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter an number2: ");
        int num2 = scan.nextInt();
        System.out.print("Enter an number3: ");
        int num3 = scan.nextInt();

        if (num1 < num2)
            if (num2 < num3){
                System.out.println("Increasing order");
            }
        if (num1 > num2)
            if (num2 > num3){
                System.out.println("Decreasing order");
            }
        if (num1 == num2 || num2 == num3 || num1 == num3){
                System.out.println("Neither Increasing nor Decreasing");
            }
    }
}
