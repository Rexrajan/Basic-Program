package Oops;

public class Oops_4 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.Area();
        circle.Circumference();
    }
}
class Circle{
    double radius;
    Circle(double R){
        this.radius = R;
    }
    public void Area(){
        double A = 3.14 * (radius * radius);
        System.out.println("Area of Circle: "+A);
    }
    public void Circumference(){
        double C = 2 * 3.14 * radius;
        System.out.println("Circumference of circle: "+(C));
    }
}