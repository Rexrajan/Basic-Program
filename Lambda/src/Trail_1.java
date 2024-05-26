@FunctionalInterface
public interface Trail_1 {

    public void add();
}
class Sum{
    public static void main(String[] args) {

        Trail_1 tr = () -> System.out.println("Hi");
        tr.add();
    }
}
