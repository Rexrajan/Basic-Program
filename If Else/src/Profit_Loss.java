import java.util.*;
public class Profit_Loss {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Cost price of product: ");
        int Cost = scan.nextInt();
        System.out.print("Enter Selling price of product: ");
        int Sell = scan.nextInt();
        if (Cost < Sell){
            int Profit = Sell - Cost;
            System.out.println("The Profit of product is "+Profit);
        }
        else if (Cost > Sell){
            int Loss = Cost - Sell;
            System.out.println("The Loss of product is "+Loss);
        }
        else{
            System.out.println("Nothing else");
        }
    }
}
