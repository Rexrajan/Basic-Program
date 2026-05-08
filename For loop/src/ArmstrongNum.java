import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an number: ");
        int num = sc.nextInt();
        int actualNum = num;
        int no_of_digits = 0;

        for (int i = num; i > 0; i = i / 10){
            no_of_digits ++;
        }

        int power = no_of_digits;

        int n = actualNum;
        int sum = 0;

        for (int i = n; i > 0; i = i / 10){

            int l = i % 10;  // to get last digit
            int mul = 1;

            for(int j = 1; j <= power; j++){
                mul = mul * l;
            }
            sum = sum + mul;
        }
        if (actualNum == sum){
            System.out.println(actualNum + " is armstrong number");
        }
        else System.out.println(actualNum+ " is not armstrong number");
    }
}
