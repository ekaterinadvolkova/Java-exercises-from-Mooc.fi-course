
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            //ask identifier
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            //ask the name
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            } 
            //add identifier and the name to the array list with same index AVOID repetition
            Archive archive = new Archive(identifier, name);
            
            if(!(archives.contains(archive))){
                archives.add(archive);
            }    
        }
        //use getIdentifier and getindex mathods
        //print the identifier and the name under same index
        
        System.out.println("==Items==");
        
        for(int i=0; i<archives.size();i++){
            System.out.println(archives.get(i).toString());
        }
    }
}
