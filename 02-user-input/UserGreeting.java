
import java.util.Scanner;

public class UserGreeting {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("what is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("how old are you? ");
        int age = scanner.nextInt();
        
        System.out.println();

        //output from class
        System.out.println("Nice to meet you, " + name + "!");
        System.out.println("You are " + age + " years old.");

        scanner.close();

    }
}
