package Oops;

public class Oops_3 {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(10,5);
        rectangle.Area();
        rectangle.Perimeter();
    }

}
class Rectangle{
    int Length;
    int breadth;
    Rectangle(int L,int B){
        this.Length = L;
        this.breadth = B;
    }
    public void Area(){
        int A = Length * breadth;
        System.out.println("Area of Rectangle: "+A);
    }
    public void Perimeter(){
        int P = 2*Length + 2*breadth;
        System.out.println("Perimeter of Rectangle: "+P);
    }
}
