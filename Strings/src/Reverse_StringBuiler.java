public class Reverse_StringBuiler {
    public static void main(String[] args) {
        String name  = "Rex Rajan ";

        StringBuilder str = new StringBuilder();
        System.out.println(System.identityHashCode(str));
        str.append("Hello");
        str.deleteCharAt(1);
        System.out.println(str);
        System.out.println(System.identityHashCode(str));
        str.append("Welcome");
        System.out.println(System.identityHashCode(str));

        /*StringBuilder reverse = new StringBuilder();

        for (int i = name.length()-1 ; i >= 0; i--){
            reverse.append(name.charAt(i));
        }
        System.out.println(reverse);*/
    }
}
