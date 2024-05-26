package Inheritent;

public class Single_Inheritance {
    public static void main(String[] arg){
        Child child = new Child();
        child.operation();
        child.activity();
        System.out.println(child.getA());
        System.out.println(child.b);
    }
}
class Parent{
    private int a = 10;
    int b = 30;
    void operation(){
        int c = a + b;
        System.out.println(c);
    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
class Child extends Parent{
    String name = "Baby";
    int month = 10;
    void activity(){
        System.out.println("Play");
    }
}
