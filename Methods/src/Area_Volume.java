import java.util.Scanner;
public class Area_Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of length: ");
        double l = in.nextDouble();
        System.out.print("Enter value of breadth: ");
        double b = in.nextDouble();
        System.out.print("Enter value of height: ");
        double h = in.nextDouble();

        area(l,b,h);
        volume(l,b,h);
    }
    public static void area(double l,double b,double h){
        if(l > b){
            double LSA = (2 * (l * h)) + (2 * (b * h));
            double TSA = (2 * (l * b)) + (2 * (l * h)) + (2 * (b * h));
            System.out.println("LSA of cuboid = "+LSA);
            System.out.println("TSA of cuboid = "+TSA);
        }
        else if ((l == b) && (b == h)){
            double LSA = (4 * (l * l));
            double TSA = (6 * (l * l));
            System.out.println("LSA of cube = "+LSA);
            System.out.println("TSA of cube = "+TSA);
        }
        else{
            System.out.println("Enter an Proper value!!!!");
        }
    }
    public static void volume(double l,double b,double h){
        if(l > b){
            double volume = l * b * h;
            System.out.println("Volume of cuboid = "+volume);
        }
        else if ((l == b) && (b == h)){
            double volume = l * l * l;
            System.out.println("Volume of cube = "+volume);
        }
    }
}
