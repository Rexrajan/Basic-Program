import java.util.function.Predicate;
import java.util.Scanner;
public class Lambda_2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String Name = scan.nextLine();
        Predicate<String> cc = (name) -> name.equals("Rex");
        System.out.println(cc.test(Name));
        Predicate<String> predicate = (name) -> name.isEmpty();
        boolean output = predicate.test("hugug");
        if (output == true)
            System.out.println("It is an empty string");
        else System.out.println(output);
    }
}
