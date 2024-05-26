@FunctionalInterface
public interface Trail_3 {
    public String Return();
}
class Print{
    public static void main(String[] args) {
        Trail_3 refer = () -> "Hello";
        System.out.println(refer.Return());
    }
}
