import java.util.*;
public class Business_Logic {
    String name;
    int age;
    Business_Enum  Result;

    public static void main(String[] args){
        Business_Logic object = new Business_Logic();

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter your name: ");
        object.name = inp.nextLine();
        System.out.print("Enter an age: ");
        object.age = inp.nextInt();

        if(object.age >= 60){
            Business_Enum output = Business_Enum.RETIRED;
            object.Result = output;
        }
        else if(object.age >= 18) {
            Business_Enum output = Business_Enum.CURRENTLY_WORKING;
            object.Result = output;
        }
        else{
            Business_Enum output = Business_Enum.NOT_ELIGIBLE;
            object.Result = output;
        }
        System.out.println(object.Result);
    }
}
