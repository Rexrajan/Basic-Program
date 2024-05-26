import java.util.Scanner;

import java.util.Scanner;
public class Occurences_Count {
    public static void main(String[] args) {
        Scanner get1 = new Scanner(System.in);
        System.out.print("Enter character to check is it there or not: ");
        String place = "cuddalore";
        char target = get1.next().charAt(0);
        int i = 0;
        int count = 0;
        while (i < place.length()){
            if (place.charAt(i) == target) {
                count = count + 1;
            }
            i++;
        }
        System.out.println(count);
    }
}
