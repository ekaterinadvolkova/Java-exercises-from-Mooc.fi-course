
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int amountOfNumbers =0;
        int sumOfNumbers = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value ==0){
                break;
            } else {
                amountOfNumbers = amountOfNumbers+1;
                sumOfNumbers= sumOfNumbers+value;
            }
        }
        System.out.println("Number of numbers: " + amountOfNumbers);
        System.out.println("Sum of the numbers: "+ sumOfNumbers);
    }
}
