import java.util.*;
public class Natural {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int natural = scanner.nextInt();

        for(int i = 1; i <= natural; i++)
            System.out.print(i+" ");
    }
}
