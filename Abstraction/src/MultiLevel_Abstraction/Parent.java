package MultiLevel_Abstraction;

public abstract class Parent {
    String name;
    int age;
    String occupation;

    public void display(){
        System.out.println("This is parent class");
        System.out.println(name);
        System.out.println(age);
        System.out.println(occupation);
    }
    public abstract void Education(String name);  //declaring abstract method
}
