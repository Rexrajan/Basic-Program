import java.util.*;
public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Tables number: ");
        int user_in = scanner.nextInt();
        int i = 1;
        int l = 10;
        while (i <= l){
            System.out.println(i+" x "+user_in+" = "+i*user_in);
            i = i + 1;
        }

    }
}
