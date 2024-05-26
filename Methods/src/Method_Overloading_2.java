public class Method_Overloading_2 {
    public static void main(String[] args) {
        division(77,7.1f);
        product(4.5d,1.1f);
        addition(5,6);
        difference(6,2);
        addition(10.2d,4.5f);
        difference(45,7.2f);
        division(5.1d,1);
        product(7,2.2f);
    }
    public static void product(int x,float y){
        System.out.println(x*y);
    }
    public static void addition(double s,float r){
        System.out.println(s+r);
    }
    public static void difference(int p,int q){
        System.out.println(p-q);
    }
    public static void addition(int s,int r){
        System.out.println(s+r);
    }
    public static void division(double w,int z){
        System.out.println(w/z);
    }
    public static void difference(int p,float q) {
        System.out.println(p - q);
    }
    public static void product(double x,float y){
        System.out.println(x*y);
    }
    public static void division(int w,float z){
        System.out.println(w/z);
    }
}