import java.util.*;
class Vehicle{
    String model;
    String colour;
    int price;
    int year_of_model;

    public String toString(){
        return "Name of Car "+model+"\nColour of car "+colour+
                "\nPrice of car "+price+"\nYear of model "+year_of_model;
    }
}
public class List_into_UserObjects {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        ArrayList vehicleList = new ArrayList();

        vehicleList.add(vehicle1.model = "Honda City");
        vehicleList.add(vehicle1.price = 1250000);
        vehicleList.add(vehicle1.colour = "White");
        vehicleList.add(vehicle1.year_of_model = 2018);

        System.out.println(vehicleList);

    }
}
