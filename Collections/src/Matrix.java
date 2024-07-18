import java.util.*;
public class Matrix{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n1 = scanner.nextInt();
        System.out.print("Enter the no of columns: ");
        int n2 = scanner.nextInt();
        int [] [] arr2 = new int[n1][n2];
        int num = 1;
        for (int i = 0; i < n1; i ++){
            for (int j = 0; j < n2; j ++){
                System.out.print((arr2[i][j] = num) +"    ");
                num = num + 1;
            }
            System.out.println();
        }

        System.out.println("Unorder");

        int r = 0;
        for (int p = 0; p < n1; p ++){
            for ( int q = 0; q < n2; q ++){
                if (p % 2 == 0){
                    System.out.print(arr2[p][q]+ "     ");
                    r = r + 1;
                }
                else{
                    r = r - 1;
                    System.out.print(arr2[p][r]+ "     ");
                }
            }
            System.out.println();
        }
    }
}