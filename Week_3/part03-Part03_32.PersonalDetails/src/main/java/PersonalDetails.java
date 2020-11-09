
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
                                                                
        int age = 0;
        String names= "";
        
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
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
        
                                                    // get string rom the list to compare
        int biggest = (nameList.get(0)).length();
        
        for (int i=0; i<nameList.size(); i++) {     // find the longest length
            
            
            String otherName = nameList.get(i);
            int number = otherName.length();
            
            if (biggest < number) {
                biggest = number;
            }  
        }
        
        for(int i = 0; i < nameList.size(); i++) { // print the longest name by the index
           
            int numberOff =(nameList.get(i)).length();
            if (biggest == numberOff) {
                System.out.println("Longest name: "+ nameList.get(i));
                break;
            }
        }
                                                    //find average by sum dividing on size of a list
        int sum=0;
        for (int i=0;i<ageList.size(); i++) {
           
            sum=sum+ ageList.get(i);
        }
        double average =sum*1.0/ageList.size();
        System.out.println("Average of the birth years: "+average);
 
    }

    
}
