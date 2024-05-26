import java.util.*;
enum Status{
    BEST,
    GOOD,
    AVERAGE,
    PASS,
    POOR,
    FAIL
        }

public class Enums_Demo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Total Mark: ");
        int TOTAL = scan.nextInt();
        if (TOTAL >= 95)
            System.out.println(Status.BEST);
        else if (TOTAL >= 80)
            System.out.println(Status.GOOD);
        else if (TOTAL >= 60)
            System.out.println(Status.AVERAGE);
        else if (TOTAL >= 40)
            System.out.println(Status.PASS);
        else if (TOTAL >= 35)
            System.out.println(Status.POOR);
        else System.out.println(Status.FAIL);
    }
}
