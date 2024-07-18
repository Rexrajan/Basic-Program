import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the count to find fibonacci: ");
        int get = scan.nextInt();
        result(get);
    }

    public static void result(int count) {

      /*  int a = 0;
        int b = 1;
        int c = 1;
        for (int i = 0; i < count; i++) {
            System.out.print(a + " ");
            a = b;
            b = c;
            c = a + b;
        }
    }*/
       int a = 0;
       int b = 1;
       if ((count == 1) || (count == 2)|| (count >=3))
        System.out.print(a+" ");
       if (count == 2 || count >=3)
        System.out.print(b+" ");

        for (int i = 3; i <= count; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            }
}

    }
