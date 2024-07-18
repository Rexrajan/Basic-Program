public class Pattern_1 {
    public static void main(String[] arg) {
        String name = "12345678";
        for (int i = 0; i < name.length(); i++){
            for ( int j = 0; j <= i; j++){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}