public class Reverse_Array {
    public static void main(String[] args) {
        int [] arr1 = new int[5];
        arr1[0] = 34;
        arr1[1] = 15;
        arr1[2] = 45;
        arr1[3] = 5;
        arr1[4] = 1;
        String [] arr2 = {"Rex","Infanta","Rose","Doss"};

        for (int i = arr1.length - 1; i >= 0; i--){
            System.out.print(arr1[i] +" ");
        }
        System.out.println("");
        for (int i = arr2.length - 1; i >= 0; i--){
            System.out.print(arr2[i] +" ");
        }
    }
}
