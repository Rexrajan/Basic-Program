package Hierarchy_Abstraction;

public class Snakes extends Animal{
    String name;
    String type;

    public void food(){
        System.out.println("I prefer to eat frogs and rats");
    }
    public void show(){
        System.out.println(name);
        System.out.println(type);
    }
}
