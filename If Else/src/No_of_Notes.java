/*
Write a program to count total number of notes in given amount
*/
import java.util.*;
public class No_of_Notes {
    public static void main(String[] args){
        Scanner getin = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int Amount = getin.nextInt();

        int n500, n100, n50, n20, n10, n5, n2, n1;
        n500 = n100 = n50 = n20 = n10 = n5 = n2 = n1 = 1;
        if (Amount >= 500){
            int notes = Amount / 500;
            n500 = notes * n500;
            Amount = Amount - (n500 * 500);
            System.out.println("Total no of 500: "+n500);
        }
        if (Amount >= 100){
            int notes = Amount / 100;
            n100 = notes * n100;
            Amount = Amount - ( 100 * n100);
            System.out.println("Total no of 100: "+n100);
        }
        if (Amount >= 50){
            int notes = Amount / 50;
            n50 = n50 * notes;
            Amount = Amount - (50 * n50);
            System.out.println("Total no of 50: "+n50);
        }
        if (Amount >= 20){
            int notes = Amount / 20;
            n20 = n20 * notes;
            Amount = Amount - (20 * n20);
            System.out.println("Total no of 20: "+n20);
        }
        if (Amount >= 10){
            int notes = Amount / 10;
            n10 = n10 * notes;
            Amount = Amount - (10 * n10);
            System.out.println("Total no of 10: "+n10);
        }
        if (Amount >= 5){
            int notes = Amount / 5;
            n5 = n5 * notes;
            Amount = Amount - (5 * n5);
            System.out.println("Total no of 5: "+n5);
        }
        if (Amount >= 2){
            int notes = Amount / 2;
            n2 = n2 * notes;
            Amount = Amount - (2 * n2);
            System.out.println("Total no of 2: "+n2);
        }
        if (Amount >= 1){
            int notes = Amount / 1;
            n1 = n1 * notes;
            //Amount = Amount - (10 * n1);
            System.out.println("Total no of 1: "+n1);
        }
    }
}
