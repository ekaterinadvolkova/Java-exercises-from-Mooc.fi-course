
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeRegExp.source;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String textTwo = scanner.nextLine();
        
        if (!(text == null)&&!(textTwo == null) ) {   
            String[] pieces = text.split(" ");
            for (String piece : pieces) {
                System.out.println(piece);
            }
            
            String[] piecesTwo = textTwo.split(" ");
            for (String pieceTwo : piecesTwo) {
                System.out.println(pieceTwo);
            }
        } 
        
    }  
}
