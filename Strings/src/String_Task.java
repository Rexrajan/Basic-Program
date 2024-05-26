public class String_Task {
    public static void main(String[] args) {
        String value ="$9.99" ;
//        String [] arr1 = value.split("\\$");
//        System.out.println(arr1[1]);

        value=value.replaceAll("[^a-zA-Z0-9]","H");
        double var = Double.valueOf(value);
        double new_value = var * 0.01d;



        System.out.println(new_value);


    }
}

//"*Hello$Wo&rld**@"