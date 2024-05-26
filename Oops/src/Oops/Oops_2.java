package Oops;
import java.util.*;
public class Oops_2 {
    public static void main(String[] args){
        String Name = "Alice";
        String Breed = "German";
            Dog dog = new Dog(Name, Breed);
            System.out.println("Name: "+dog.name + "\nBreed: " + dog.breed);
            Dog dog2 = new Dog("Peter","Labrador");
            System.out.println("Name: "+dog2.name+"\nBreed: "+dog2.breed);
    }
}
class Dog{
    String name;
    String breed;

    Dog(String Name,String Breed){
        this.name = Name;
        this.breed = Breed;
    }

}