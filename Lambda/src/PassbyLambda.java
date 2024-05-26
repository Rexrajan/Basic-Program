import java.util.function.Predicate;
public class PassbyLambda {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (a) -> a > 100;
        Check(predicate);
        System.out.println(predicate.test(700));
    }
    public static void Check(Predicate<Integer> predicate2){
        boolean output = predicate2.test(46);
        System.out.println(output);
    }
}
