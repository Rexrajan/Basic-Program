import java.util.function.BiPredicate;
public class Bipredicate_2 {
    public static void main(String[] args) {
        BiPredicate<String,Integer> biPredicate = (name,x) -> name.length() == x;
        boolean output = biPredicate.test("REX",3);
        System.out.println(output);
        System.out.println(biPredicate.test("Rajan",4));
    }
}
