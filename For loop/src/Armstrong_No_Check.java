import java.util.*;public class Armstrong_No_Check {
    public static void main(String[] args) {
        long actual_number = 370;
        long number = actual_number;
        long sum = 0;
        for (int i = 1; number > 0; i = i + 1){
            long mod = number % 10;
            long cube = mod * mod * mod;
            sum = sum + cube;
            number = number / 10;
        }
        if (actual_number == sum)
            System.out.println("Hence, It's an armstrong number");
        else
            System.out.println("It's not an armstrong number");
    }
}
