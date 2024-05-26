public class Recursive_Method {
    public static void main(String[] args) {
        System.out.println(fact(5));  // recursive method to find factorial and
    }                                   //  use if else to stop the execution
    public static int fact(int x) {
        if (x == 0) {
            return 1;
        } else {
            return x * fact(x - 1);
        }
    }
}
