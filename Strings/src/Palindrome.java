public class Palindrome {
    public static void main(String[] args) {
        String actual_name = "rrr";
        String reverse_name = "";
        int i = actual_name.length() - 1;
        while ( i >= 0){
            reverse_name = reverse_name + actual_name.charAt(i);
            i = i - 1;
        }
        if (actual_name.equals(reverse_name))   //.equals checks the value of corresponding objects whereas == checks the memory location of the objects
            System.out.println("It is a palindrome");
        else
            System.out.println("Not a palindrome");

    }
}
