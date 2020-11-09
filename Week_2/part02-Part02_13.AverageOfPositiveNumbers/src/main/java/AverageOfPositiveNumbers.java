
import java.util.Scanner;

public class AverageOfPositiveNumbers {

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
  
            } else if (value >0) {
                amountOfNumbers = amountOfNumbers +1;
                sum = value + sum;
                average = sum / amountOfNumbers;
            } else if (value <0) {
                continue;
            }
        }
        if (sum ==0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(average);
        }
    }
}
