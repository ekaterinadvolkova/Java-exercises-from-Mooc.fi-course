
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(7);
        numbers.add(3);
        numbers.add(6);
        numbers.add(10);
        
        printNumbersInRange(numbers, 5, 10);
    }
    
    public static void printNumbersInRange (ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        
        System.out.println("The numbers in the range [ " + lowerLimit + ", " +  upperLimit + " ]" );
        for (int number: numbers) {
            if (number <= upperLimit && number >= lowerLimit) {
                System.out.println(number);
            }
        }
    }
   
}
