import java.util.*;
public class Rectangle {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int l = scan.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = scan.nextInt();
        int perimeter = 2*l + 2*b; //Four sides of rectangle
        int area = l*b;
        System.out.println("Area of rectangle: "+area);
        System.out.println("Perimeter of rectangle: "+perimeter);
        if (area > perimeter)
            System.out.println("Area of rectangle is greater than its perimeter");
        else
            System.out.println("Perimeter is greater than its area");
    }
}
