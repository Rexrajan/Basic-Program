public class Expected_Values {
    public static void main(String[] args) {
        String capital = "chennai";
        boolean start = capital.startsWith("ch");
        boolean end = capital.endsWith("ai");
        if (start && end)
            System.out.println("Both starting and ending values are equal");
        else if (start || end)
            System.out.println("Either starting or ending values are equal");
        else
            System.out.println("Both starting and ending values are not equal");
    }
}
