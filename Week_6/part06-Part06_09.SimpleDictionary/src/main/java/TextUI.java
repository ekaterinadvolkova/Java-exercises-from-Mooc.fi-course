/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekaterinavolkova
 */
import java.util.Scanner;



public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
        
    }
    public void start() {
        while (true) {
            System.out.println("Command: ");
            String cmd = this.scanner.nextLine();
            if (cmd.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (cmd.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                dictionary.add(word, translation);
            } else if (cmd.equals("search")) {
                System.out.println("To be translated: ");
                String need = scanner.nextLine();
                String checkNull = dictionary.translate(need);
                if (checkNull == null) {
                    System.out.println("Word " + need + " was not found");
                } else {
                    System.out.println("Translation: " + checkNull);
                }
            }
            else {
                System.out.println("Unknown command");
                continue;
            }
        }
        
    }
    
    
}