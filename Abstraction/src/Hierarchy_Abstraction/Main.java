package Hierarchy_Abstraction;

public class Main {
    public static void main(String[] args){
        Cheetah cheetah = new Cheetah();
        cheetah.eyes = 2;
        cheetah.speed();
        cheetah.leg = 4;
        cheetah.food();
        Animal animal = new Snakes();
        Main main = new Main();
        main.final_reference(animal);
    }
    public  void final_reference(Animal new_ref){
        new_ref.food();                      //here abstraction working
    }
}
