public class Factorial {
    public static void main(String[] args) {
        int num = 15;
        int i = 1;
        int fact = 1;

        while(i <= num){
            fact = fact * i;
            i = i + 1;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}
