/*
A library charges a fine for every book returned late.
For first 5 days the fine is 50 paise,
for 6-10 days fine is one rupee and above 10 days fine is 5 rupees.
If you return the book after 30 days your membership will be cancelled.
Write a program to accept the number of days the member is late to return the book and
display the fine or the appropriate message
*/

import java.util.*;
public class Library_Charges {
    public static void main(String[] args) {
        Scanner reference = new Scanner(System.in);
        System.out.print("Enter no of days: ");
        int no_of_days = reference.nextInt();

        if ( no_of_days <= 5){
            System.out.println("You are fined for Rs:50 paise");
        }
        else if ( no_of_days >= 6 && no_of_days <= 10)
            System.out.println("You are fined for Rs: 1 /-");
        else if ( no_of_days > 10 && no_of_days <= 30)
            System.out.println("You are fined for Rs: 5 /-");
        else System.out.println("Your membership will be cancelled");
    }
}
