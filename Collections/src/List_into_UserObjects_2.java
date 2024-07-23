import java.util.*;
public class List_into_UserObjects_2 {
    public static void main(String[] args){
        ArrayList<Bike> bikelist = new ArrayList();
        Bike bike1 = new Bike();
        bike1.setName("PUlsar NS200");
        bike1.setCc("199.5CC");
        bike1.setColour("White with Black");
        bike1.setPrice(190000);
        bike1.setYear_of_model(2024);

        Bike bike2 = new Bike();
        bike2.setName("MT-15");
        bike2.setCc("155CC");
        bike2.setColour("Black");
        bike2.setPrice(209000);
        bike2.setYear_of_model(2024);

        Bike bike3 = new Bike();
        bike3.setName("Honda CBR");
        bike3.setCc("250RR");
        bike3.setColour("Black");
        bike3.setYear_of_model(2023);
        bike3.setPrice(220000);

        bikelist.add(bike1);
        bikelist.add(bike2);
        bikelist.add(bike3);
        System.out.println(bikelist);
    }
}
class Bike{
    String name;
    String cc;
    String colour;
    int price;
    int year_of_model;


    public void setName(String name){
        this.name = name;
    }

    public void setCc(String cc){
        this.cc = cc;
    }

    public void setColour(String col){
        this.colour = col;
    }

    public void setPrice(int amount){
        this.price = amount;
    }

    public void setYear_of_model(int year){
        this.year_of_model = year;
    }

    public String toString(){
        return "Name of Bike "+name+" CC "+cc+" Colour "+colour+
                " Price "+price+" Year of manufacture "+year_of_model;
    }

}
