public class Equality_Two_Strings {
    public static void main(String[] args) {
        String name1 = "Jake";
        String name2 = "Jake";
        String lower = name1.toLowerCase();
        String lower2 = name2.toLowerCase();
        if (lower.equals(lower2))
            System.out.println("The Two Strings are equal");
        else
            System.out.println("Two Strings are different");
    }
}
