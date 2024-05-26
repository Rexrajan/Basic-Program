public class Arrays_Sum {
    public static void main(String[] args) {
        int [] arr = {34,11,99,22,19};
        System.out.println(Arrays(arr));
    }
    public static int Arrays(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
