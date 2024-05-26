public class Trim {
    public static void main(String[] args) {
        String para = "      Hey How are You?   ";
        System.out.println(para.trim());
        String x = new String("Hey");
        String y = "Hey";
        String z = "Hey";
        System.out.println(x == z);
        System.out.println(x.equals(y));
    }
}
