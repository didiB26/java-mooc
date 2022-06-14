
import java.util.Scanner;


public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String text = scanner.nextLine();
            
            if (text.equals("stop")){
                break;
            }
            
            if (text.equals("add")){
                System.out.println("To add:");
                String text2 = scanner.nextLine();
                this.list.add(text2);
            }
            
            if (text.equals("list")){
                this.list.print();
            }
            
            if (text.equals("remove")){
                System.out.println("Which one is removed?");
                int numar = Integer.valueOf(scanner.nextLine());
                this.list.remove(numar);
            }
            
        }
    }
}
