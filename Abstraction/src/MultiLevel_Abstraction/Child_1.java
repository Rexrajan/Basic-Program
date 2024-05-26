package MultiLevel_Abstraction;

public abstract class Child_1 extends Parent{
    int age ;
    String name;
    String status;
    public void show(){
        System.out.println("This is 1st child class");
        System.out.println(name);
        System.out.println(age);
        System.out.println(status);
    }
}
