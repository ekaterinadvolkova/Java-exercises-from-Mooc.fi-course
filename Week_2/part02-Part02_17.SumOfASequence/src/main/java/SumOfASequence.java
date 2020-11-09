
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());
        
        int startNumber =1;
        int sum=0;
        
        for (;startNumber <= lastNumber; startNumber++){
            sum = sum+startNumber;  
        }
        System.out.println(sum);
    }
}
