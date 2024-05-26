public class Fibonacci_Series {
    public static void main(String[] args) {
        System.out.println(Fibo(3));
    }
    public static int Fibo(int a){
        if (a <= 1)
            return 1;
        else return Fibo(a - 1) + Fibo(a - 2);
    }
}
