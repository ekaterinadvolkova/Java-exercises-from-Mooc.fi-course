
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 1;
        int number;
        int amount=(-1);
        double average = 0*1.0;
        int odds =-1;
        int evens =0;
       
        while (true){
            System.out.println("Give numbers: ");
            number = Integer.valueOf(scanner.nextLine());
            sum = sum + number;
            amount ++;
            
            if (number %2 ==0) {
                evens ++;
            } else {
                odds++;
            }

            
            if (number == (-1)){
                System.out.println("Thx! Bye!");
                
                System.out.println("Sum: " + sum);
                average = sum / amount ;
                
                System.out.println("Numbers: "+ amount);
                System.out.println("Average: " + average);
                System.out.println("Even: " +evens);
                System.out.println("Odd: " + odds);
                break;
            } 
            
        }
    }
}


