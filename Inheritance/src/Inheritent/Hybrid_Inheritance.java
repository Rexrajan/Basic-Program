package Inheritent;

import java.sql.SQLOutput;

public class Hybrid_Inheritance {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        child2.Bike();  //  (Method Overriding)     MultiLevel Inheritance
        child2.Property();  //    MultiLevel Inheritance
        Child3 child3 = new Child3();
        child3.Property();   // Single Inheritance
        child3.Elder_Son();  // Single Inheritance
    }
}
class Parent_A{
    void Bike(){
        System.out.println("Parent having own Bike");
    }
    void Property(){
        System.out.println("Parent having two Houses");
    }
}
class Child1 extends Parent_A{
    void Bike(){
        System.out.println("Child1 own his Parent's Bike");
    }
}
class Child2 extends Child1{
    void Bike(){
        System.out.println("CHild2 own his Parent's Bike");
    }
}
class Child3 extends Parent_A{
    void Elder_Son(){
        System.out.println("He takes family responsibilites");
    }

}
