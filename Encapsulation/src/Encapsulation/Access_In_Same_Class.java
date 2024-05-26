package Encapsulation;

public class Access_In_Same_Class {
    public static void main(String[] args){
        Access_In_Same_Class object = new Access_In_Same_Class();
        object.setName("Rock Rex");
        System.out.println(object.getName());
        object.setAge(55);
        System.out.println(object.getAge());
    }
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
