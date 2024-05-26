/*A certain grade of steel is graded according to the following conditions

        Hardness must be greater than 50
        Carbon content must be less than 0.7
        Tensile strength must be greater than 5600
        The grades are as follows:

        Grade is 10 if all three conditions are met
        Grade is 9 if conditions (i) and (ii) are met
        Grade is 8 if conditions (ii) and (iii) are met
        Grade is 7 if conditions (i) and (iii) are met
        Grade is 6 if only one condition is met
        Grade is 5 if none of the conditions are met
        Write a program, which will require the user to give values of hardness, carbon content
        and tensile strength of the steel under consideration and output the grade of the steel*/

import java.util.*;
public class Hardness_Steel {
    public static void main(String[] args) {
        Scanner input_reference = new Scanner(System.in);
        System.out.print("Enter Hardness of Steel: ");
        int hardness = input_reference.nextInt();
        System.out.print("Enter Carbon content of Steel: ");
        double carbon_content = input_reference.nextDouble();
        System.out.print("Enter Tentile strength of Steel: ");
        int Tensile_Strength = input_reference.nextInt();

        if (hardness > 50){
            if (carbon_content < 0.7){
                if (Tensile_Strength > 5600){
                    System.out.println("The Grade of Steel is: 10");
                }
            }
        }
        if (hardness > 50){
            if (carbon_content < 0.7){
                if (Tensile_Strength <= 5600){
                    System.out.println("The Grade of Steel is: 9");
                }
            }
        }
        if (hardness <= 50){
            if (carbon_content < 0.7){
                if (Tensile_Strength > 5600){
                    System.out.println("The Grade of Steel is: 8");
                }
            }
        }
        if (hardness > 50) {
            if (carbon_content >= 0.7) {
                if (Tensile_Strength > 5600) {
                    System.out.println("The Grade of Steel is: 7");
                }
            }
        }
        if (hardness > 50) {
            if (carbon_content >= 0.7) {
                if (Tensile_Strength <= 5600) {
                    System.out.println("The Grade of Steel is: 6");
                }
            }
        }
        if (hardness <= 50) {
            if (carbon_content >= 0.7) {
                if (Tensile_Strength <= 5600) {
                    System.out.println("The Grade of Steel is: 5");
                }
            }
        }
    }
}
