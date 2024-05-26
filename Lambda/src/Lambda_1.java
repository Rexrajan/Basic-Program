import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
public class Lambda_1 {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer> consumer = (a,b) -> System.out.println(a+b);
        consumer.accept(4,10);
        Function<Integer,String> function = (x) -> "x";
        function.apply(3);
        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x+y;
        int number = biFunction.apply(50,20);
        System.out.println(number);
    }
}
