public class Recursive_Factorial {
    public static void main(String[] args){
       int result = Factorial(3);
        System.out.println(result);
    }
    public static int Factorial(int a) {
        if (a == 0) {
            return 1;
        }
        else {
            return a * Factorial(a - 1);
        }
    }
}
