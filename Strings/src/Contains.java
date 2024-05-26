public class Contains {
    public static void main(String[] args) {
        String name = "Rex";
        String name2 = new String("Rex");
        if(name.contentEquals(name2))
            System.out.println("The two strings are same anagrams");
        else
            System.out.println("The two strings are different");
    }
}
