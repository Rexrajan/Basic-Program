public class Sum_Odd_Index_Arrays {
    public static void main(String[] args) {
        long [] array2 = {54,8,11,44,22,33};
        long Sum_the_odd_index = 0;

        long j = 1;
        while (j < array2.length){
            Sum_the_odd_index = Sum_the_odd_index + array2[(int)j];
            System.out.print(array2[(int)j]+" ");
            j = j + 2;
        }
        System.out.println("\nThe Sum of odd index is : "+Sum_the_odd_index);
    }
}
