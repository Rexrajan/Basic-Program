import java.util.Scanner;
class DiagonalMarix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = scan.nextInt();
        System.out.print("Enter the no of col: ");
        int col = scan.nextInt();
        int [][] arr = new int[row][col];
        for (int i = 0; i < row; i ++){
            for (int j = 0; j < col; j ++){
                if (i == j) {
                    System.out.print((arr[i][j] = 1) +" ");
                }
                else{
                    System.out.print((arr[i][j] = 0) + " ");
                }
            }
            System.out.println();
        }
    }
}
