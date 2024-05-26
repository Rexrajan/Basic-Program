public class Method_Override {
    public void print(){
        System.out.println("This is parent class");
    }
    public static void main(String[] args){
        Child obj = new Child();
        obj.print();

    }
}
class Child extends Method_Override{
    public void print(){
        System.out.println("This is child class ");
        System.out.println("The method overloaded");
    }
}
