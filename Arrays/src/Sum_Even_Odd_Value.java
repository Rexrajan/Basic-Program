public class Sum_Even_Odd_Value {
    public static void main(String[] args) {
        int [] arr = {34,22,89,1,45};
        int sum_even = 0;
        int sum_odd = 0;
        int i = 0;
        while (i < arr.length){
            if ( arr[i] % 2 == 0){
                sum_even = sum_even + arr[i];
            }
            else{
                sum_odd = sum_odd + arr[i];
            }
            i = i + 1;
        }
        System.out.println("Sum of even arrays are: "+sum_even);
        System.out.println("Sum of odd arrays are: "+sum_odd);
    }

}
