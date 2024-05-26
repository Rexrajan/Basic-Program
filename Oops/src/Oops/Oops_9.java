package Oops;

public class Oops_9 {
    int id;
    double salary;
    float avg;
    String name;
    public void output(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Oops_9 oops9 = new Oops_9();
        oops9.id = 4;
        oops9.salary = 35000d;
        oops9.avg = 55.5f;
        oops9.name = "Rock";
        oops9.output();
    }
}
