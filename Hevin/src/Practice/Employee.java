package Practice;
import java.util.*;

enum Main{
    RETIRED ,
    ACTIVE ,
    NOT_ELIGIBLE
}
public class Employee {
    int age;
    String name;

    Main type;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee name : ");
        String Name = scanner.nextLine();
        System.out.print("Enter the employe age : ");
        int Age = scanner.nextInt();
        Employee employee = new Employee();
        employee.name = Name;
        employee.age = Age;

        if(employee.age > 60){
          //  Main var = Main.RETIRED;
            employee.type =Main.RETIRED;
        }
        else if (employee.age > 21) {
            Main value = Main.ACTIVE;
            employee.type = value;
        }
        else{
            Main value = Main.NOT_ELIGIBLE;
            employee.type = value;
        }
            System.out.println(employee.type);
    }
}

