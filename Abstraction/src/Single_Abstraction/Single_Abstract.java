package Single_Abstraction;

public abstract class Single_Abstract {  //parent enforcing child to do some work compulsory
    int age;
    String Name;
    public void display(){
        System.out.println(age);
        System.out.println(Name);
    }
    abstract void meeting();  //only declare the abstract method
}
