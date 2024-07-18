public class Vowel_InString {
    public static void main(String[] args){
        String value = "xxxxx";
        System.out.println(print(value));
    }
    public static boolean print(String get){
        String low_cas = get.toLowerCase();
        boolean result = false;
        for(int i = 0; i < low_cas.length(); i++){
            //char low = Character.toLowerCase(get.charAt(i));
            if (low_cas.charAt(i) == 'a' || low_cas.charAt(i) == 'e') {
              //  return true;
                result = true;
                break;

            }
            else if (low_cas.charAt(i) == 'i' || low_cas.charAt(i) == 'o') {
                 //   return true;
                result = true;
                break;
            }
            else if (low_cas.charAt(i) == 'u') {
              //  return true;
                result = true;
                break;
            }
        }
        return result;
    }
}
