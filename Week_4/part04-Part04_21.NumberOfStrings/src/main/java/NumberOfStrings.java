
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        
        while (true) {
            String bookTitle = scanner.nextLine();
            titles.add(bookTitle);
            if (bookTitle.equals("end")) {
                System.out.println(titles.size()-1);
                break;
            }
        }
    }
}
