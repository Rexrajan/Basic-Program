import java.util.*;
public class Convert_Time {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int userValue = scan.nextInt();
        int hour = userValue / 60;
        int minutes = userValue % 60;
        if (minutes == 0){
            String value = "0";
            System.out.println(hour+":"+minutes+value);
        }
        else {
            System.out.println(hour + ":" + minutes);
        }
    }
}
