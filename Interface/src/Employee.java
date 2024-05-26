public class Employee implements Company{
    public void Punctuality(){
        System.out.println(name);
        System.out.println("You should arrive company at correct time");
    }
    public void Conference(){
        System.out.println(location);
        System.out.println("Everybody should be at the time");
    }
    public void Project_Status(){
        System.out.println(status);
        System.out.println("Complete it within 2 or 3 days");
    }
    public void Personal(String issue){
        System.out.println("I have Health problems in ".concat(issue));
    }
    public static void main(String[] args){
        Employee emp = new Employee();
        emp.Punctuality();
        emp.Project_Status();
        emp.Conference();
        emp.Personal("Dialysis");
    }

}
