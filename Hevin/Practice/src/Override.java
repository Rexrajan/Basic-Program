public class Override extends MathodOverR {
    @java.lang.Override
    public void Print() {
        System.out.println("THIS IS CHILD");
    }

    public static void main(String[] args) {
        Override name = new Override();
        name.Print();
    }
}