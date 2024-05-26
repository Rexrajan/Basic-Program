public class Recursive_Basic {
    public static void main(String[] args) {
        System.out.println(Add(5));
    }
    public static int Add(int x){
        if (x == 1)
            return x;
        else return x + Add(x -1);
    }
}
