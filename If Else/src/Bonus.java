/*The current year and the year in which the employee joined the organization are entered through
the keyboard.
If the number of years for which the employee has served the organization is greater than 3
then a bonus of Rs. 2500/- is given to the employee.
If the years of service are not greater than 3, then the program should do nothing*/
import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.*;
public class Bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Employee joined year: ");
        int joined_year = input.nextInt();
        int current_year = 2024;
        int year_of_service = current_year - joined_year;

        if ( year_of_service >= 3){
            System.out.println("Rs. 2500/- of bonus is given to the employee by the company");
        }
        else System.out.println("Your experience is less than 3 years!!\n No Bonus for you!!");
    }
}
