public class Swap3{
	public static void main(String[] args){
		int a = 20;
		int b = 40;
		int c = 5;
		
		a = a + b + c; // a = 65
		b = a - ( b + c); // b = 20
		c = a - ( b + c); // c = 40
		a = a - ( b + c); // a = 5
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
	}
}
		
		