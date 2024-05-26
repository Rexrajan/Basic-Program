package CallByRefference;

public class Student {
    String Student_Name;
    int Student_Mak;

    public  void Display(Student new_ref ) {
        new_ref.Student_Name = "Hevin";
        new_ref.Student_Mak = 99;
        System.out.println(new_ref.Student_Name);
        System.out.println(new_ref.Student_Mak);

    }

    public static void main(String[] args) {
        Student cal = new Student();
        cal.Display(cal);
        System.out.println(cal.Student_Mak);
        System.out.println(cal.Student_Name);
    }
}
