
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("How many days would you like to convert to seconds?");
int numberOfDays = Integer.valueOf(scanner.nextLine());

int resultOfSeconds = numberOfDays *86400;  //12 hours* 60 minutes* 60 seconds
System.out.println(resultOfSeconds);
    }
}
