import java.util.Scanner;

public class Prefer_To_Eat {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int Age = scanner.nextInt();
        int new_age = Age >= 60 ? 1 : Age >= 5 ? 2 : 0;
        switch (new_age){
            case 1: {
                System.out.println("You should only eat " + Food_Varieties.WHITE_RICE);
                break;
            }
            case 2: {
                System.out.println("You may eat "+ Food_Varieties.BRIYANI+" or "+Food_Varieties.WHITE_RICE);
                break;
            }
            case 0: {
                System.out.println("You should only eat "+Food_Varieties.DOSA);
            }
        }
    }
}
