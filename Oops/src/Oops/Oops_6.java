package Oops;

public interface Oops_6 {
    public void getArea();

}
class Main{
    public static void main(String[] args) {
        Rectangles rect = new Rectangles(10,5);
        rect.getArea();
        Circles circle = new Circles(4);
        circle.getArea();
        Triangle triangle = new Triangle(5,3);
        triangle.getArea();
    }
}
class Rectangles implements Oops_6{
    int l;
    int b;
    Rectangles(int L,int B){
        this.l = L;
        this.b = B;
    }
    public void getArea(){
        System.out.println("Area of Rectangle: "+l*b);
    }
}
class Circles implements Oops_6{
    double r;
    Circles(double R){
        this.r = R;
    }
    public void getArea(){
        System.out.println("Area of Circle: "+ 3.14* (r * r));
    }
}
class Triangle implements Oops_6{
    int base;
    int height;
    Triangle(int B,int H){
        this.base = B;
        this.height = H;
    }
    public void getArea(){
        System.out.println("Area of Triangle: "+0.5*(base*height));
    }
}