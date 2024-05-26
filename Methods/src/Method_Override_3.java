public class Method_Override_3 {
    public static void main(String[] args) {
        Car obj1 = new Car();
        obj1.start();

    }
}
class Vehicle2
{
    void start()
    {
        System.out.println("Vehicle starting...");
    }
}

class Car extends Vehicle2
{
  
    void start()
    {
        super.start();
        System.out.println("Car starting...");
    }
}


