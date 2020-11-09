
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
       
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                Integer numberlist = Integer.valueOf(reader.nextLine());
                
                if(numberlist<=upperBound &&numberlist>=lowerBound) {
                   list.add(numberlist); 
                }
            }
            System.out.println("Numbers: " + list.size());
            
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
