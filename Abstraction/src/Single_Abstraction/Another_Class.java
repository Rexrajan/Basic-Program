package Single_Abstraction;

public class Another_Class extends Single_Abstract{
    public void Tour(String name){
        String place = name;
        System.out.println(place);
    }
    void meeting(){
        System.out.println("You should attend the meeting by evening");
    }

    public static void main(String[] args) {
        Another_Class another = new Another_Class();
        another.display();
        another.meeting(); // The abstract method achieved by the concept of method overriding
    }
}
