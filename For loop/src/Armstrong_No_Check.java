import java.util.*;public class Armstrong_No_Check {
    public static void main(String[] args) {

                long actual_number = 153;
                long number = actual_number;
                long sum = 0;

                // Step 1: Count digits
                int digits = String.valueOf(actual_number).length();

                // Step 2: Calculate Armstrong sum
                while (number > 0) {
                    long mod = number % 10;

                    long power = 1;
                    for (int i = 0; i < digits; i++) {
                        power = power * mod;
                    }

                    sum = sum + power;
                    number = number / 10;
                }

                // Step 3: Check
                if (actual_number == sum)
                    System.out.println("Hence, It's an Armstrong number");
                else
                    System.out.println("It's not an Armstrong number");

        /*long actual_number = 370;
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
            System.out.println("It's not an armstrong number");*/
    }
}
