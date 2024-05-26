package Inheritent;

public class MultiLevel_Inheritance {
    public static void main(String[] args){
        Student2 student2 = new Student2();
        System.out.println(student2.name);
        System.out.println(student2.rank);
        System.out.println(student2.roll_no);
    }
}
class School{
    String name = "KMMHSS";
    int roll_no = 22;
    String place = "City";

}
class Student1 extends School{

    int roll_no = 3;
    String rank = "No: 1 RANK";
    String place = "Village";
}
class Student2 extends Student1{
    int roll_no = 1;
    String place = "Village 2";
}
