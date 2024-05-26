package Inheritent;

public class Hierarchy_Inheritance {
    public static void main(String[] args){
        Hierarchy_Child_1 child1 = new Hierarchy_Child_1();
        System.out.println(child1.age);
        System.out.println(child1.age_1);
        Hierarchy_Child_2 child2 = new Hierarchy_Child_2();
        System.out.println(child2.name);
        System.out.println(child2.name_2);
        child1.occupation();
        child2.occupation();
        child1.status();
        child2.status();
        child1.Dress();    //Method overloading
        child2.Dress();    //Method overloading
    }
}
