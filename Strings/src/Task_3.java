import java.util.*;
public class Task_3 {
    public static void main(String[] args){
        String old_value = "*Hello$World**";
        String [] arr = old_value.split("\\$");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(arr[0]);
        stringBuffer.append(arr[1]);
        System.out.println(stringBuffer);

        String new_string = stringBuffer.toString();
        String [] arr2 = new_string.split("\\*");
        System.out.println(arr2[1]);
    }
}
