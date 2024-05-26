/*Write a program to input basic salary of an employee and calculate its Gross salary according to following:

Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.*;
public class Employee_Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your salary amount: ");
        int salary = in.nextInt();

        double HRA;
        double DA;
        if (salary <= 10000) {
            HRA = (20 / 100d) * salary;
            System.out.println("Your House Rent Allowance(HRA) "+HRA);
            DA = (80/100d) * salary;
            System.out.println("Your Dearness Allowance(DA) "+DA);
            System.out.println("Your gross net salary is: " + (HRA + DA + salary));
        }
        else if (salary <= 20000) {
            HRA = (25 / 100d) * salary;
            System.out.println("Your House Rent Allowance(HRA) "+HRA);
            DA = (90 / 100d) * salary;
            System.out.println("Your Dear Allowance(DA) is: " + DA);
            System.out.println("Your gross net salary is: "+ (HRA + DA + salary));
        }
        else {
            HRA = (30 / 100d) * salary;
            System.out.println("your remaining salary is " + HRA);
            DA = (95 / 100d) * salary;
            System.out.println("Your Dear Allowance(DA) is: " + DA);
            System.out.println("Your gross net salary is: "+ (HRA + DA + salary));
        }

    }
}
