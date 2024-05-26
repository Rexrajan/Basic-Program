package CallByRefference;

public class Call_ByRef2 {
        String name;
   public static void Display(StringBuilder sb2){
            sb2.append("Pegion ");
            sb2.append("buffello ");
           /* System.out.println(sb2 +"all flew on the tree");
            System.out.println(sb2 +"was walking the roadside at 9pm");*/
              //System.out.println(obj + "was walking inside the zoo");


    }

    public static void main(String[] args) {
        Call_ByRef2 animal = new Call_ByRef2();
//        System.out.println(animal.name);
//        animal.Display(animal);
        StringBuilder sb = new StringBuilder();
        sb.append("ELEPHANT ");
        sb.append("LION ");
        System.out.println(sb);
        Display(sb);
        System.out.println(sb);
    }
}
