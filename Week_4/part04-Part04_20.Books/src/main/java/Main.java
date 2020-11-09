import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<String> titles = new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String bookTitle = scanner.nextLine();
            titles.add(bookTitle);
            
            if (bookTitle.isEmpty()) {
                break;
            }
            
            System.out.println("Pages: ");
            int page = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book (bookTitle, page, publicationYear));
            
        }
        
        System.out.println("What information will be printed?");
        String information = scanner.nextLine();
        
        if (information.equals("everything")) {
            for (int i=0; i<books.size(); i++) {
                System.out.println(books.get(i));
            }
            
           
        } else if (information.equals("name")) {
            for (int i=0; i<titles.size(); i++) {
                System.out.println(titles.get(i));
            }
        }

    }
}
