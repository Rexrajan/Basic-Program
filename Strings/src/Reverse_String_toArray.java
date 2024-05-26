public class Reverse_String_toArray {
    public static void main(String[] args) {
        String name = "Infenta";
        char [] array = name.toCharArray();

        for (int i = array.length - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
