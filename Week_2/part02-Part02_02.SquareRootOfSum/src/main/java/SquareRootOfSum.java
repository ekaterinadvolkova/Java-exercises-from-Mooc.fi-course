
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write an integer");
        int numberOne = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Write an integer");
        int numbeTwo = Integer.valueOf(scanner.nextLine());
        
        int squareRoot;
        squareRoot = (int) Math.sqrt(numberOne + numbeTwo);
        System.out.println(squareRoot);
    }
}
