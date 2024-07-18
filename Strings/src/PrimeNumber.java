public class PrimeNumber {
    public static void main(String[] args){
        int a = 8;
        System.out.println(method(a));
    }
    public static String method(int n){
        if (n == 0 || n == 1){
            return "Not a Prime number";
        }
        for ( int i = 2; i < n; i++){
            if (n % i == 0)
                return "Not a Prime number";
        }
        return "It's a Prime number";
    }
}
