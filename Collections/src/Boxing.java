public class Boxing {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(30); //Boxing
        System.out.println(i);
        int j = i.intValue();  //Unboxing
        System.out.println(j);

        Double decimal = Double.valueOf(3.4);
        String digit = "123";
        Integer num = Integer.valueOf(digit);    //converting string into objects
        System.out.println(num + 7);
        System.out.println(decimal.doubleValue());
        int k = Integer.parseInt(digit);     //converting string into primitives
        System.out.println(200+k);
    }
}
