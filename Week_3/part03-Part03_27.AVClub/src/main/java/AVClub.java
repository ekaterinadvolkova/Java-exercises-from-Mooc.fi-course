
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        if (text==null) {
            
        } else {
        
            text=text+ " "+ scanner.nextLine()+ " "+ scanner.nextLine();
             
        }
        AVClub(text);
        
        
    }
    
    public static void AVClub(String text) {
        String[] pieces = text.split(" ");
        int piecesLength=pieces.length; // figure out number of words
        
            for (int i=0; i<pieces.length; i++) { //check if any piece has "av"
                if (pieces [i].contains ("av")) {
                    System.out.println(pieces[i]); //print av piece
                }
            }
        
    }
}
    
   
      


