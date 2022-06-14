package title;


import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title;
        while (true){
            System.out.println("Enter title: ");
            title = scanner.nextLine();
            
            if (title.isEmpty()){
                break;
            }
            
            //System.out.println(title);
        }
        
        Application.launch(UserTitle.class,
            "--smth=" + title);

    }
}