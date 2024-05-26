package Encapsulation;

public class Employee {
    private int emp_id = 11;
    private String emp_name = "Rajan";
    private double emp_salary = 40000d;
    public int getemp_id(){
        return emp_id;
    }
    public void setemp_id(int new_id){
        emp_id = new_id;
    }
    public String getemp_name(){
        return emp_name;
    }
    public void setemp_name(String new_name){
        emp_name = new_name;
    }
    public double getemp_salary(){
        return emp_salary;
    }
    public void setemp_salary(double new_salary){
        emp_salary = new_salary;
    }
}
class Accessing{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1.getemp_id()+" "+emp1.getemp_name()+" "+emp1.getemp_salary());
        emp1.setemp_id(1);
        emp1.setemp_name("Rex");
        emp1.setemp_salary(24000d);
        System.out.println("After Modification");
        System.out.println("Employee 1:\n"+emp1.getemp_id()+" "+emp1.getemp_name()+" "+emp1.getemp_salary());
        Employee emp2 = new Employee();
        emp2.setemp_id(2);
        emp2.setemp_name("Infenta");
        emp2.setemp_salary(40000d);
        System.out.println("Employee 2:\n"+emp2.getemp_id()+" "+emp2.getemp_name()+" "+emp2.getemp_salary());
    }
}
