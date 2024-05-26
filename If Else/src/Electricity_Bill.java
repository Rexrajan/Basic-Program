/*Write a program to input electricity unit charges and calculate total electricity bill according to the given condition:

        For first 50 units Rs. 0.50/unit
        For next 150 units Rs. 0.75/unit
        For next 250 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill*/
import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner get_in = new Scanner(System.in);
        System.out.print("Enter how much of unit consumed: ");
        int unit = get_in.nextInt();

        double EB_Bill;

        if (unit <= 50){
            EB_Bill = unit * 0.50;
            System.out.println("Your EB BILL is: "+EB_Bill);
        }
        else if (unit <= 150){
            EB_Bill = unit * 0.75;
            System.out.println("Your EB BILL is: "+EB_Bill);
        }
        else if (unit <= 250){
            EB_Bill = unit * 1.20;
            System.out.println("Your EB BILL is: "+EB_Bill);
        }
        else{
            EB_Bill = unit * 1.50;
            System.out.println("Your EB BILL is: "+EB_Bill);
        }

    }
}
