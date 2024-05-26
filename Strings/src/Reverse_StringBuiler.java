public class Reverse_StringBuiler {
    public static void main(String[] args) {
        String name  = "Rex Rajan ";

        StringBuilder reverse = new StringBuilder();

        for (int i = name.length()-1 ; i >= 0; i--){
            reverse.append(name.charAt(i)+"\n");
        }
        System.out.println(reverse);
    }
}
