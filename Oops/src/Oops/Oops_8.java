package Oops;

public class Oops_8 {
    public static void main(String[] args) {
        Employees emp = new Employees();
        emp.set_empid(45);
        emp.set_empname("Rex Rajan");
        System.out.println(emp.get_empid());
        System.out.println(emp.get_empname());
        System.out.println(emp.get_empsalary());
    }
}
class Employees{
    private long emp_id;
    private String emp_name;
    private String emp_salary = "35000";

    public void set_empid(long ID){
        this.emp_id = ID;
    }
    public long get_empid(){
        return emp_id;
    }
    public void set_empname(String Name){
        this.emp_name = Name;
    }
    public String get_empname(){
        return emp_name;
    }
    public String get_empsalary(){
        return emp_salary;
    }
}