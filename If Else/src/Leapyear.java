public class Leapyear {
    public static void main(String[] args) {
        int x = 2100;
        if ( (x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
