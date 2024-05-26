package Oops;

public class Oops_12 {
    public static void main(String[] args) {
        Trail trail = new Trail();
        Trail.y = 5;
        trail.x = 10;
        trail.print();
        Trail.static_oup();
    }
}
class Trail{
    int x;
    static int y;
    static String company = "Cognizant";
    public static void static_oup(){
        System.out.println(y);
        System.out.println(company);
    }
    public void print(){
        System.out.println(x);
    }
}
