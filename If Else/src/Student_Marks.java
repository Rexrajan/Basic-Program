/*
The marks obtained by a student in 5 different subjects are input through the keyboard.
The student gets a division as per the following rules:
Write a program to calculate the division obtained by the student

        Percentage above or equal to 60 - First division
        Percentage between 50 and 59 - Second division
        Percentage between 40 and 49 - Third division
        Percentage less than 40 – Fail
*/

import java.util.*;
public class Student_Marks {
    public static void main(String[] args) {
        Scanner get_in = new Scanner(System.in);
        System.out.print("Enter mark for tamil: ");
        int tamil = get_in.nextInt();
        System.out.print("Enter mark for english: ");
        int english = get_in.nextInt();
        System.out.print("Enter mark for maths: ");
        int maths = get_in.nextInt();
        System.out.print("Enter mark for science: ");
        int science = get_in.nextInt();
        System.out.print("Enter mark for social: ");
        int social = get_in.nextInt();

        double per = (tamil + english + maths + science + social) / 500d * 100;
        System.out.println(per);
        if (per >= 60)
            System.out.println("First division");
        else if (per >= 50)
            System.out.println("Second division");
        else if (per >= 40)
            System.out.println("Third division");
        else System.out.println("FAIL !!");

    }
}
