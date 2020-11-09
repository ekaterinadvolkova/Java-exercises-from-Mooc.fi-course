
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        
        Statistics allNums = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter numbers:");
        
        int n = Integer.parseInt(reader.nextLine());
        
        while (n != -1){
            
            allNums.addNumber(n);
            
            if (n % 2 == 0){
                even.addNumber(n);
            }
            
            else {
                odd.addNumber(n);
            }
            
            n = Integer.parseInt(reader.nextLine());
            
        }
        System.out.println("sum: " + allNums.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());
    }
}


