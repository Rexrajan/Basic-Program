/*In a company, worker efficiency is determined on the basis of the time required for a worker
to complete a particular job. If the time taken by the worker is between 2 – 3 hours,
then the worker is said to be highly efficient.
If the time required by the worker is between 3 – 4 hours,
then the worker is ordered to improve speed.
If the time taken is between 4 – 5 hours, the worker is given training to improve his speed,
and if the time taken by the worker is more than 5 hours, then the worker has to leave the company.
If the time taken by the worker is input through the keyboard, find the efficiency of the worker*/

import java.util.*;
public class Work_Efficiency {
    public static void main(String [] arg) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter the time required for worker: ");
        int time_taken = get.nextInt();
        if (time_taken > 5) {
            System.out.println("Worker have to leave the company");
        } else if (time_taken >= 4) {
            System.out.println("Worker was given training to improve the speed");
        } else if (time_taken >= 3) {
            System.out.println("Worker have to improve the speed");
        } else if (time_taken <= 2) {
            System.out.println("Worker have an high efficiency");
        }
    }
}
