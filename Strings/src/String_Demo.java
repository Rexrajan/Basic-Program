public class String_Demo {
    String variable;
    /*public String toString(){    //ToString override to print a value in an object.
        return "ToString Overridden\n"+this.variable;
    }*/

    public String_Demo(String name) {
        this.variable = name;
    }

    public static void main(String[] args) {
        String bike = "Hero Honda";
        System.out.println(bike.hashCode());
        bike = new String("MT-15");
        System.out.println(bike.hashCode());
        System.out.println(bike);

        String words = "You are very intelligent";
        int count = 1;
        for (int i = 0; i < words.length(); i++){
            if (words.charAt(i) == ' '){
                count = count + 1;
            }
        }
        System.out.println(count);

        String sentence = "Java is fast and secure. Java is higly portable. Most of the companies running by java.";
        int count2 = 0;
        int j = 0;
        while ( j < sentence.length()){
            if (sentence.charAt(j) == '.')
                count2++;
            j++;
        }
        System.out.println(count2);

        String_Demo obj = new String_Demo("Rex Rajan" );
        System.out.println(obj);

        String car = new String("Honda");
        String twoWheeler = new String("Honda");
        String laptop = "Dell";
        String desktop = "Dell";
        System.out.println(laptop == desktop);
        System.out.println(car.hashCode());
        System.out.println(twoWheeler.hashCode());
        System.out.println(car == bike);
    }
}
