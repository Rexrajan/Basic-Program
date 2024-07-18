public class Fibonacci_Alternative {
    public static void main(String[] args) {
        output(5);
    }
    public static void output(int count){
        int a = 0;
        int b = 1;
        int c = 1;
        for ( int i = 1; i <= count; i++){
            System.out.print(a+ " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}
