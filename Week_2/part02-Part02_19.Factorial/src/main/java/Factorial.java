
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        int startNumber = 1;
        int factorial = 1;
        
        for (;startNumber <= number; startNumber++){
            factorial = factorial *startNumber;  
        }
        
        System.out.println("Factorial: " + factorial);
    }
}
