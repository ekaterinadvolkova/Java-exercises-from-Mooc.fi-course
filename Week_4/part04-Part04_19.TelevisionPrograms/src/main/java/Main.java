import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        ArrayList<Integer> duration = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
        
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int durationofMovie = Integer.valueOf(scanner.nextLine());
        
            programs.add(new TelevisionProgram (name, durationofMovie));
            duration.add(durationofMovie);
  
        }
        
        
        
        
        System.out.println("Program's maximum duration? ");
        int maxduration = Integer.valueOf(scanner.nextLine());
        
        //find index in array of duration
          for(int i = 0; i < duration.size(); i++) {
            int nummer = duration.get(i);
                if (maxduration == nummer) {
                    System.out.println(programs.get(i));
                    
                }
        }

    }
}
