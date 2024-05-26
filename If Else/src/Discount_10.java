/*while purchasing certain items, a discount of 10% is offered if the quantity purchased is more than 100.
If quantity and price per item are input through the keyboard, write a program to calculate the total expenses*/
import java.util.*;
public class Discount_10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no of quantity: ");
        int quantity = in.nextInt();
        System.out.print("Enter price per quantity: ");
        int price = in.nextInt();

        if (quantity > 100){
            int total_price = quantity * price;
            System.out.println("Total Amount is: "+total_price);
            double dis = (90/100d) * (total_price);
            System.out.println("10% discount of your Amount is: "+ (dis));
        }
        else{
            System.out.println("Your actual amount is: "+ (quantity * price));
        }
    }
}
