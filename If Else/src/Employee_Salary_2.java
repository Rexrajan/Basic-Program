/*If his basic salary is less than Rs. 1500, then HRA = 10% of basic salary and
DA = 90% of basic salary. If his salary is either equal to or above Rs. 1500,
then HRA = Rs. 500 and DA = 98% of basic salary.
If the employee's salary is input through the keyboard write a program to find his gross salary*/
import java.util.*;
public class Employee_Salary_2 {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter employee salary: ");
        int emp_salary = get.nextInt();

        if (emp_salary < 1500){
            double HRA = 10/100d * emp_salary;
            double DA = 90/100d * emp_salary;
            System.out.println("Your gross salary is: "+ (HRA + DA + emp_salary));
        }
        else {
            double HRA = 500;
            double DA = 98/100d * emp_salary;
            System.out.println("Your gross salary is: "+ (HRA + DA + emp_salary));
        }
    }
}
