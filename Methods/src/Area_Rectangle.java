import java.util.*;
public class Area_Rectangle {
    public static void main(String[] args) {
        Area_Rectangle.Rectangle();
    }
    public static void Rectangle(){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        int l = scanner.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        int b = scanner.nextInt();
        System.out.println(l*b);
    }

}
