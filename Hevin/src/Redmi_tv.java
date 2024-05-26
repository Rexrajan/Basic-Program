public class Redmi_tv {
    String name = "Sports edition";
    int size = 32;

    public void display() {

        System.out.println(name);
        System.out.println(size);
    }

    public static void main(String[] args) {
        lg_tv product = new lg_tv();
        product.display1();
        System.out.println(product.c);
        System.out.println(product.d);

    }
}