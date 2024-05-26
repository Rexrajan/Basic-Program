public class Television extends Mobile {
    public  void Display(){
        System.out.println("TV REPAIR SHOP");
    }
    String tv_name = "LG";
    int tv_model_no=1334;

    public static void main(String[] args) {
        Television obj = new Television();
        obj.Print();
        System.out.println(obj.mobile_model_no);
        System.out.println(obj.mobile_name);
        obj.Display();
        System.out.println("TV MODEL NO : "+obj.tv_model_no);
        System.out.println("TV MODEL NAME : "+obj.tv_name);

    }
}
