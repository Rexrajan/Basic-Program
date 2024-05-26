import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter an number: ");
        int number = input2.nextInt();

        if (number % 5 == 0 && number % 11 == 0){
            System.out.println(number+" is divisible by both 5 and 11");
        }
        else{
            System.out.println(number+" is not divisible by both 5 and 11");
        }
    }
}
