public class String_Data_Types {
    public static void main(String[] args) {
       int a = 56;
       long b = 875;
       double d = 94.6321d;
       char c = 'o';

       String intstring = Integer.toString(a);
       String longstring = Long.toString(b);
       String decimal = Double.toString(d);
       String charstring = Character.toString(c);
       System.out.println(intstring);
       System.out.println(longstring);
       System.out.println(decimal);
       System.out.println(charstring);
    }
}
