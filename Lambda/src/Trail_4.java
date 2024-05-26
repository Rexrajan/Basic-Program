@FunctionalInterface
public interface Trail_4{
    public void Addition(int x,int y);
}
class Show{
    public static void main(String[] args) {
        Trail_4 Tr = ( a, b) -> System.out.println(a + b);
        Tr.Addition(5,4);
        Trail_4 tr2 = (a,b) -> System.out.println(a - b);
        tr2.Addition(5,4);
    }
}
