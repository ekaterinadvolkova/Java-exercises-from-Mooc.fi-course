
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int first = 0;
        int second = 0;


        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");


            String input = scan.nextLine();
            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);


            if (command.equalsIgnoreCase("add")) {
                if (amount > 0 && amount <= 100 && first + amount <= 100) {
                    first = first + amount;

                } else if (first + amount >= 100) {
                    first = 100;
                }

            } else if (command.equalsIgnoreCase("move")) {
                if (amount > 0 && amount <= 100) {

                    if (first - amount >= 0) {

                        first = first - amount;
                        if (second + amount > 100) {
                            second = 100;
                        } else {
                            second = second + amount;
                        }

                    } else if (first - amount < 0) {

                        if (second + amount > 100) {
                            first = 0;
                            second = 100;
                        } else {
                            second = second + first;
                            first = 0;
                        }
                    } else if (amount >= 100) {
                        first = 0;
                        second = 100;
                    }


                }

            } else if (command.equalsIgnoreCase("remove")){

                if (amount < 0 ){
                    second = second;
                } else if(second - amount < 0) {
                    second = 0;
                } else {
                    second = second - amount;
                }
            }
        }
    }
}



