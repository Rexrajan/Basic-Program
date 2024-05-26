import java.util.function.BiPredicate;
public class Bipredicate {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> bipredicate = (a, b) -> a>b;
        boolean out = bipredicate.test(10,5);
        boolean out2 = bipredicate.test(100,500);
        System.out.println(out);
        System.out.println(out2);
    }
}
