public class Sum_Even {
    public static void main(String[] args) {
        int natural_num = 100;
        int i = 1;
        int sum = 0;
        while (i <= natural_num){
            if (i % 2 == 0){
                sum = sum + i;
            }
            i = i + 1;
        }
        System.out.println("The Sum of all even natural number: "+sum);
    }
}
