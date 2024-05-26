@FunctionalInterface
public interface Trail_2 {
    public void print(String a);
}
class Output{
    public static void main(String[] args) {
        Trail_2 ref =  (name) -> System.out.println(name);
        ref.print("Lambda Expression");
    }
}
