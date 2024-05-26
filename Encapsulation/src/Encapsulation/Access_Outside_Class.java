package Encapsulation;

public class Access_Outside_Class {
    public static void main(String[] args) {
        Encapsulated obj5 = new Encapsulated();
        System.out.println(obj5.getUser_name());  //reading the hidden data from another class
        System.out.println("Current password: "+obj5.getPasswrd());//reading the hidden data from another class
        //obj5.setPasswrd(28412876);
        System.out.println("New password: "+obj5.getPasswrd());
        obj5.set_values("Rock",12345678);
        System.out.println(obj5.getUser_name());
        System.out.println(obj5.getPasswrd());
    }
}
