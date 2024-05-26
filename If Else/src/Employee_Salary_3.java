/*Write a program to calculate the salary as per the following table

Gender	Year of Service	   Qualifications	   Salary
 Male	  >= 10	           Post - Graduate	   15000
          >= 10	               Graduate	       10000
          < 10	           Post - Graduate	   10000
           < 10	               Graduate	       7000
Female	  >= 10	           Post - Graduate	   12000
          >= 10	               Graduate	       9000
           < 10	           Post - Graduate	   10000
           < 10	               Graduate	       6000
*/

import java.util.*;
public class Employee_Salary_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Gender: ");
        char gender = input.next().charAt(0);
        System.out.print("Enter year of experience: ");
        int year_of_experience = input.nextInt();
        System.out.print("Enter your Qualification\nPost Graduate for 'P'\nGraduate for G :\n");
        char qual = input.next().charAt(0);

        if ( gender == 'M' || gender == 'm') {
            if (year_of_experience >= 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 15000");
                }
                if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 10000");
                }
            }
            if (year_of_experience < 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 10000");
                }
                if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 7000");
                }
            }
        }

        else if ( gender == 'F' || gender == 'f') {
            if (year_of_experience >= 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 12000");
                }
                else if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 9000");
                }
            }
            if (year_of_experience < 10) {
                if (qual == 'P' || qual == 'p') {
                    System.out.println("Your Salary is 10000");
                }
                else if (qual == 'G' || qual == 'g') {
                    System.out.println("Your salary is 6000");
                }
            }
        }
    }
}
