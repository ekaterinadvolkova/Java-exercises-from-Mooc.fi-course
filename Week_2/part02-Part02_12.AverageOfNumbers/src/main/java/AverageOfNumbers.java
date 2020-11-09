
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double average=0;
        int amountOfNumbers =0;
        double sum =0;
        
        while (true) {
            System.out.println("Give a number:");
            int value = Integer.valueOf(scanner.nextLine());
            if (value ==0){
                break;
            } else {
                amountOfNumbers = amountOfNumbers +1;
                sum = value + sum;
                average = sum / amountOfNumbers;
            }
        }
        System.out.println("Average of the numbers: " + average);
    }
}
