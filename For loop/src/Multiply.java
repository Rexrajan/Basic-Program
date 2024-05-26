import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int num = inp.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(i+" x "+num+" = "+(i*num));
    }
}
