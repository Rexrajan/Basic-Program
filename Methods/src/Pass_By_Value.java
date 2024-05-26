public class Pass_By_Value {
    public static void main(String[] args) {
        int a = 10, b = 20;
        print(a, b);
        System.out.println(a);
        System.out.println(b);

    }
    //Every method in java, it creates a separate storage is known as stack memory
    //After method was loaded it goes back to static memory
    public static void print(int a,int b){
        a = 1000;       //This is Local variable which were applied only inside this
        b = 2000;       //corresponding method
        System.out.println(a);
        System.out.println(b);

    }
}
