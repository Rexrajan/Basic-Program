public class Pass_By_String {
    public static void main(String[] args){
        String name = "Rex";
        System.out.println("Before modification: "+name);
        passing(name);
        System.out.println("After modification: "+name);
    }
    public static void passing(String name){
        name = "Rajan";
        System.out.println(name);
    }
}
