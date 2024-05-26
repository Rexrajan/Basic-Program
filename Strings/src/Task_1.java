/* To print only alphabets without any special characters */
public class Task_1 {
    public static void main(String[] arg){
        String value = "*Hello$World**";
        StringBuffer strbuff = new StringBuffer();

        for (int i = 0; i < value.length(); i++){
            if ((value.charAt(i) >= 'a') && (value.charAt(i) <= 'z'))
                strbuff.append(value.charAt(i));
            else if ((value.charAt(i) >= 'A') && (value.charAt(i) <= 'Z'))
                strbuff.append(value.charAt(i));
        }
        System.out.println(strbuff);
    }
}
