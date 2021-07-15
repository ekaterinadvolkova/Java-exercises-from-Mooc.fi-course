
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Container first = new Container();
        Container second = new Container();


        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: "+ first);
            System.out.println("Second: "+ second);


            String input = scan.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);


            if (command.equalsIgnoreCase("add")) {
                first.add(amount);

            } else if (command.equalsIgnoreCase("move")) {

                if( first.contains() - amount >=0){
                    first.remove(amount);
                    second.add(amount);
                } else {
                    second.add(first.contains());
                    first.remove(first.contains());

                }


            } else if (command.equalsIgnoreCase("remove")){
                second.remove(amount);
            }
        }
    }
}



