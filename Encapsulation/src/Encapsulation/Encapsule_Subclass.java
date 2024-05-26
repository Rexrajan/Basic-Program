package Encapsulation;

public class Encapsule_Subclass {
    public static void main(String[] args){
        Sub_class obj1 = new Sub_class();
        System.out.println(obj1.School);
        System.out.println("Mark1: "+obj1.getMark1());  //reading only hidden data
        System.out.println("Mark2: "+obj1.getMark2());  //reading only hidden data
    }
}
class Sub_class{
    private int Mark1 = 89;
    private int Mark2 = 97;
    String School = "KMMHSS";
    public int getMark1(){
        return Mark1;
    }

    public int getMark2(){
        return Mark2;
    }
}
