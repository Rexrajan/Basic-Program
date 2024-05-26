import java.util.Scanner;
public class Min_Max_Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[5];
        for (int i = 0; i < array.length; i++){
            System.out.print("Enter an number: ");
            array[i] = input.nextInt();
        }
        int max_value = array[0];
        int min_value = array[0];

        for(int i = 0; i < array.length; i++){
            if (array[i] > max_value) {
                max_value = array[i];
            }
            else if (array[i] < min_value) {
                min_value = array[i];
            }
        }

        System.out.println("Maximum value is: "+max_value);
        System.out.println("Minimun value is: "+min_value);
    }
}
