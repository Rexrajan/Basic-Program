package Oops;

public class Oops_5 {
    public static void main(String[] arg){
        Employee emp = new Employee("Rex","Developer",25000);
        System.out.println(emp.salary);
        emp.Calculate();
        System.out.println(emp.name+"\n"+emp.job_title+"\n"+emp.salary);
    }
}
class Employee{
    String name;
    String job_title;
    double salary;
    Employee(String Name,String Job,double Salary){
        this.name = Name;
        this.job_title = Job;
        this.salary = Salary;
    }
    public void Calculate(){
        salary = 40000;
    }
}
