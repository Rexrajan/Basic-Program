import java.util.*;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int x = input1.nextInt();

        if (x % 2 == 0){
            System.out.println(x+" is Even number");
        }
        else{
            System.out.printf(x+" is Odd number");
        }
    }
}
