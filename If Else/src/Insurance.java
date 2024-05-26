import java.util.*;
public class Insurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter age of driver: ");
        int age = scan.nextInt();
        System.out.println("Enter gender of driver: ");
        char gender = scan.next().charAt(0);
        System.out.println("Enter status of driver: ");
        char status = scan.next().charAt(0);

        if (status == 'M' || status == 'm'){
            System.out.println("Driver are eligible to apply insurance");
        }
        else if ((status == 'U' || status == 'u') && (gender == 'M' || gender == 'm') && (age >30)){
            System.out.println("Insurance applicable for male driver");
        }
        else if ((status == 'U' || status == 'u') && (gender == 'F' || gender == 'f') && (age >25)){
            System.out.println("Insurance applicable for female driver");
        }
    }
}
