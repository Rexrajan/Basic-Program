package CallByRefference;

public class CallRef_3 {

    public static void print(StringBuilder Ref){
        Ref.reverse();
        System.out.println(Ref.toString());

    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("HEVIN");
        sb.append("ANISTEN");
        System.out.println("Before modification : "+sb);
        print(sb);
        System.out.println("After modification : "+sb);
    }
}
