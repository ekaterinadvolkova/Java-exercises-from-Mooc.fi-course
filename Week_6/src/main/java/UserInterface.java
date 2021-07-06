import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String com = scanner.nextLine();

            if (com.equals("stop")){
                break;
            }


            switch (com) {
                case "add":
                    System.out.println("To add: ");
                    String toAdd = scanner.nextLine();
                    todoList.add(toAdd);
                    break;

                case "list":
                    todoList.print();
                    break;

                case "remove":
                    System.out.println("Which one is removed? ");
                    int remove = scanner.nextInt();
                    todoList.remove(remove);
                    break;

//                case "stop":
//                    break;
                default:
                    break;
            }

        }
    }
}
