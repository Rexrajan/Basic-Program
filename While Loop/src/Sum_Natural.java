public class Sum_Natural{
    public static void main(String[] args) {
        int initial = 1;
        int last_num = 50;
        int sum = 0;
        while (initial <= last_num){
            sum = sum + initial;
            initial = initial + 1;
        }
        System.out.println("The Sum of Natural No's are: "+sum);
    }
}
