
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int age = 0;
        String names= "";
        
                                                                
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            age=Integer.valueOf(parts [1]); 
            ageList.add(age);  
            names=String.valueOf(parts[0]);
            nameList.add(names);
        }
        
        
        int biggest = ageList.get(0); // finf biggest number in the list and the index
        for(int i = 0; i < ageList.size(); i++) {
            int number = ageList.get(i);
            if (biggest < number) {
                biggest = number;
            }  
            
        }
        
        for(int i = 0; i < nameList.size(); i++) { // print the name by the index
            int number = ageList.get(i);
            if (biggest == number) {
                System.out.println("Name of the oldest: "+ nameList.get(i));
                break;
            }
        }

    }
 
}
    
   

