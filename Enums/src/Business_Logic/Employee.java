package Business_Logic;

import java.util.Scanner;

public class Employee {
    String name;
    int age;
    Emp_Status value;
    public void output(){
        System.out.println(name);
        System.out.println(value);
    }

    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String emp_Name = scan.nextLine();
        System.out.print("Enter your age: ");
        int emp_Age = scan.nextInt();
        Employee employee = new Employee();
        employee.name = emp_Name;
        employee.age = emp_Age;

        if (employee.age > 60) {
            Emp_Status var = Emp_Status.RETIRED;
            employee.value = var;
        }
        else if (employee.age > 21)
            employee.value = Emp_Status.CURRENTLY_WORKING;
        else employee.value = Emp_Status.NOT_ELIGIBLE;

        employee.output();
    }
}
