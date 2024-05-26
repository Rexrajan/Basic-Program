import java.util.*;
public class Range {
    public static void main(String[] args) {
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter an number: ");
        int number = input3.nextInt();

        if (number <= 1000 && number >= 0)
            System.out.println("The number ranges between 0 and 1000");
        else if (number <= 10000 )
            System.out.println("The number ranges between 1001 and 10000");
        else if (number <= 100000)
            System.out.println("The number ranges between 10001 and 100000");
    }
}
