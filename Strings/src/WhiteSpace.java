public class WhiteSpace {
    public static void main(String[] args) {
        String string = "What's about your yesterday";
        System.out.println(method(string));
    }
    public static String method(String details){
        details = "What's about your yesterday";
        String new_value = "";
        int i = 0;
        while (i < details.length()){
            if(Character.isWhitespace(details.charAt(i)) == false){
                new_value = new_value + details.charAt(i);
            }
            i = i + 1;
        }
        return new_value;
    }
}
