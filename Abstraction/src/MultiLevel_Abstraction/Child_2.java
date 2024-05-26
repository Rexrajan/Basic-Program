package MultiLevel_Abstraction;

public class Child_2 extends Child_1{
    int age;
    String name;
    String status;

    public void output(){
        System.out.println("This is 2nd child class");
        System.out.println(name);
        System.out.println(age);
        System.out.println(status);
    }
    public void Education(String name){
        String place = name;
        System.out.println("Child_2 is studying 8th standard in St.Mary's School "+place);
    }
    public static void main(String[] args){
        Child_2 child2 = new Child_2();
        child2.Education("Cuddalore");
        child2.name = "Infenta";
        child2.age = 15;
        child2.status = "Studying";
        child2.output();
        child2.show();
        child2.display();
    }
}
