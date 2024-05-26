import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an number to count the digits: ");
        long num = inp.nextLong();
        long count = 0;
        while (num > 0){
            long mod = num % 10;
            count = count + 1;
            num = num / 10;
        }
        System.out.println("The no of digits are: "+count);

    }
}
