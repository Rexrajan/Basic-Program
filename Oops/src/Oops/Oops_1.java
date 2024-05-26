package Oops;

public class Oops_1 {
    public static void main(String[] args){
        Person person1 = new Person("Rex",23);
        Person person2 = new Person("Infenta",15);
        System.out.println(person1.name);
        System.out.println(person1.age);
        System.out.println(person2.name +"\n"+person2.age);
    }
}
class Person{
    String name;
    int age;
    Person(String value,int value2){
        this.name = value;
        this.age = value2;
    }
}