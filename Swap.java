public class Swap {
    public static void main(String[] args) {  // Open main method
	
	        /*int a = 20;
            int b = 30;
        System.out.println("Before swapping:\na = " + a);
        System.out.println("b = " + b);
       
        a = a + b; // a = 50
        b = a - b; // b = 20
        a = a - b; // a = 30
        System.out.println("After swapping: a = " + a);
        System.out.println("b = " + b); */
        int a = 20;
        int b = 30;
        System.out.println("Before swapping:\na = " + a);
        System.out.println("b = " + b);
        interchange(a, b);
    }  // Close main method

    public static void interchange(int a, int b) {
        a = a + b; // a = 50
        b = a - b; // b = 20
        a = a - b; // a = 30
        System.out.println("After swapping: a = " + a);
        System.out.println("b = " + b);
    }

}  // Close Swap class
