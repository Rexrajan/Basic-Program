public class Sum_Even_Index_Arrays {
    public static void main(String[] args) {
        int [] array = {12,7,28,98,10};

        int sum_even_index = 0;

        for ( int i = 0; i < array.length; i = i + 2){
            sum_even_index = sum_even_index + array[i];
            System.out.print(array[i]+ " ");
        }
        System.out.println("\nSum of even index value: "+sum_even_index);
    }
}
