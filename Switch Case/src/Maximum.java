import java.util.Scanner;
public class Maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter Number 2: ");
        int n2 = scanner.nextInt();

        int max = (n1 > n2)? 1 : 2;

        switch (max){
            case 1:
                System.out.println(n1+" is maximum");
                break;
            case 2:
                System.out.println(n2+" is maximum");
        }
    }
}
