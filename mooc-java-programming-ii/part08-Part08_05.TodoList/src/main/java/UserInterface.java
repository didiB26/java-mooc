
import java.util.Scanner;


public class UserInterface {
    private TodoList list = new TodoList();
    private Scanner scanner = new Scanner(System.in);
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true){
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            }
            if (command.equals("add")){
                String text = scanner.nextLine();
                this.list.add(text);
                continue;
            }
            
            if (command.equals("list")){
                this.list.print();
            }
            
            if (command.equals("remove")){
                int number = Integer.valueOf(scanner.nextLine());
                this.list.remove(number);
            }
        }
    }
    
}
