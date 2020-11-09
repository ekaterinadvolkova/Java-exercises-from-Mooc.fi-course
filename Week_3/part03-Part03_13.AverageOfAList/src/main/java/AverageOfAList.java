
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        ArrayList<Integer> list = new ArrayList<>();
        
        // adding them on a list until user gives -1.
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }
        System.out.println("");
        
        // Then it computes the average of the numbers on the list
        int size =list.size()-1;
        int sum = 0;
        
        for (int i=0; i<=size; i++) {
            list.get(i);
            sum= sum+list.get(i);
        }
        int avNumber=list.size();
        double average= sum*1.0 /avNumber *1.0;
        // and prints it.
        System.out.println("Average: "+ average);
            
        }
    }
        // and prints it.
        
   

