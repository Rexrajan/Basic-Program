public class Split_With_Comma {
    public static void main(String[] args) {
        String name = "RexRajan,Infenta,Doss";
        String [] arr = name.split(",");
        for (String i : arr){
            System.out.println(i);
        }
    }
}
