import java.util.*;
public class Prime_Factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The number : ");
        int num = input.nextInt();
        for(int i = 2; i< num; i++) {
            while(num%i == 0) {
                System.out.println(i+" ");
                num = num/i;
            }
        }
        if(num >2) {
            System.out.println(num);
        }
    }
}
