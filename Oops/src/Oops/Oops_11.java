package Oops;

public class Oops_11 {
    public static void main(String[] args) {
        Multiple_Constructor multi = new Multiple_Constructor("Infanta",56);
        Multiple_Constructor multi2 = new Multiple_Constructor(23,11);
        Multiple_Constructor multi3 = new Multiple_Constructor();
    }
}
class Multiple_Constructor{
    String student;
    int rollno;
    int age;
    Multiple_Constructor(){
        System.out.println("No argumented Constructor");
    }
    Multiple_Constructor(String Name,int No){
        this.student = Name;
        this.rollno = No;
    }
    Multiple_Constructor(int No,int Age){
        this.rollno = No;
        this.age = Age;
    }
}