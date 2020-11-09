
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<String> readNamesFromFile = readNamesFromFile(file,team);
        
        
    }
    
    public static  ArrayList <String> readNamesFromFile(String file, String team) {
        ArrayList<String> teamNames = new ArrayList<>();
        int wins=0;
        int loss =0;
        int games=0;

        try (Scanner reader = new Scanner (Paths.get(file))) {
            int i=0;

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                String[] parts = line.split(",");
                String name = String.valueOf(parts[0]);
                teamNames.add(name);
                String nameTwo = String.valueOf(parts[1]);
                teamNames.add(nameTwo);
                int homescore = Integer.valueOf(parts[2]);
                int visitscore=Integer.valueOf(parts[3]);
                
                if(team.equals(name)){
                    games++;
                    if(homescore>visitscore) {
                        wins++;
                    } else {
                        loss++;
                    }
                    
                } else if (team.equals(nameTwo)){
                    games++;
                    if(homescore<visitscore) {
                        wins++;
                    } else {
                        loss++;
                    }
                } 
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " +games);
        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+loss);
        
        return teamNames;
    }
       
}
