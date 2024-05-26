public class Method_Overloading_1 {
    public static void main(String[] arg){
        print(4,5);
        print(6,4.3f);
        print(3.4d,4.6d);
        print("Rex",007);
    }
    public static void print(String name,int i){
        System.out.println(name+" "+i);
    }
    public static void print(int x,int y){
        System.out.println("The Sum is "+(x+y));
    }
    public static void print(int x,float y){
        System.out.println("The Sum is "+(x-y));
    }
    public static void print(double p,double q){
        System.out.println("The Sum is "+(p+q));
    }
}
