public class Recursive {
    public static void main(String[] args){
        Recursive.method(2);
    }
    public static void method(int x){
        if (x == 0) {
            //System.out.println("Recursive over");
            return;
        }
        System.out.println("Recursive");
        Recursive.method(x - 1);
    }
}
