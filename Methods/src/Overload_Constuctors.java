import java.sql.SQLOutput;

public class Overload_Constuctors {
    public static void main(String[] args) {
        Vehicle obj = new Vehicle();

        Vehicle obj2 = new Vehicle(2015,"TATA");

        Vehicle obj3 = new Vehicle(450000d);
        obj.print();
    }
}
class Vehicle{
    public Vehicle(){
        System.out.println("Default Constructor");
        System.out.println("Car Sales for Diwali ");

    }
    public Vehicle(double price){
        System.out.println("");
        System.out.println("Single argument Constructor");
        System.out.println(price);
    }
    public Vehicle(int year,String company){
        System.out.println("");
        System.out.println("Two argument Constructor");
        System.out.println(year);
        System.out.println(company);
    }

    public void print(){
        System.out.println("Instance method");

    }

}
