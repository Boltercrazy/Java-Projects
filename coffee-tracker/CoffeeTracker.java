
import java.util.Scanner;

public class CoffeeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ask for name
        System.out.println("what is your name? ");
        String name = scanner.nextLine();

        //how many cups of coffee they drink per day
        System.out.println("How many cups of coffee do you drink per day? ");
        int CupsPerDay = scanner.nextInt();

        //declare variables of price
        double dailyTotal = CupsPerDay * 2.50;
        double weeklyTotal = dailyTotal * 7; 

        //outputs
        System.out.println();
        System.out.println("Hi " + name + "!");
        System.out.println("Wow you drink " + CupsPerDay + "!" + " Thats a lot!");
        System.out.println("That costs you " + dailyTotal + " per day!");
        System.out.println("OMG thats " + weeklyTotal + " per week!");

       scanner.close(); 
    }
}