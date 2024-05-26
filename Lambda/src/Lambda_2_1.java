import java.util.function.Predicate;

public class Lambda_2_1 {
    public static void main(String[] args) {
        Predicate<Integer> in = (a) -> a > 100;
        System.out.println(in.test(50));
    }
}
