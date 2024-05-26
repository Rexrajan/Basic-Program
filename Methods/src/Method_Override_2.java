public class Method_Override_2 {
    public static void main(String[] args) {
        Dog obj2 = new Dog();
        int output = obj2.leg(4);
        System.out.println(output);
    }
}
class Anilmal{
    public int leg(int a){
        return a - 2;
    }
}
class Dog extends Anilmal{
    public int leg(int a){
        System.out.println("Child class executed");
        return a + 0;
    }
}