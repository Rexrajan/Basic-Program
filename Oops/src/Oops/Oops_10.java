package Oops;

import java.util.Objects;

public class Oops_10 {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oops_10 oops10 = (Oops_10) o;
        return age == oops10.age && Objects.equals(name, oops10.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public static void main(String[] args) {
        Oops_10 oops10 = new Oops_10();
        oops10.name = "Rex";
        oops10.age = 23;
        Oops_10 oops102 = new Oops_10();
        oops102.name = "Rex";
        oops102.age = 23;
        System.out.println(oops10 == oops102);
        System.out.println("Object's value: "+oops10.equals(oops102));
    }
}
