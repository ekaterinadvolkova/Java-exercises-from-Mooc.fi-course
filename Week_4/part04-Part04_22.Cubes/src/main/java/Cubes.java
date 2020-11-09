
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String nummer=scanner.nextLine();
            if (nummer.equals("end")) {
                break;
            }
            int number=Integer.valueOf(nummer);
            System.out.println((number*number*number));
            
        }

    }
}
