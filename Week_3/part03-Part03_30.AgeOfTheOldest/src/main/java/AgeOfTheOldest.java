
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
                                                                
        ArrayList<Integer> ageList = new ArrayList<>(); 
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            
            String[] parts = input.split(",");
            
            age=Integer.valueOf(parts [1]);                    
            ageList.add(age);
                                                                   
        }
        
        int biggest = ageList.get(0);

        for(int i = 0; i < ageList.size(); i++) {
            int number = ageList.get(i);
                if (biggest < number) {
                    biggest = number;
                }
                
               
            
        }
        System.out.println("Age of the oldest: "+biggest);
   
    }
    
}

