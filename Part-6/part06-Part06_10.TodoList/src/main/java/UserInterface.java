
import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = this.scanner.nextLine();
            switch (command) {
                case "stop":
                    //System.out.println("Loop Stopped");
                    return;
                case "add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "remove":
                    remove();
                    break;
                default:
                    //System.out.println("Unknown command");
            }
        }
    }

    private void add() {
        System.out.println("To add:");
        String task = this.scanner.nextLine();
        this.todoList.add(task);
    }

    private void list() {
        this.todoList.print();
    }
    
    private void remove() {
        System.out.println("Which one is removed?");
        int id = Integer.valueOf(this.scanner.nextLine());
        this.todoList.remove(id);
    }
}
