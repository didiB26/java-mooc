
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> vect = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }  
            vect.add(input);    
        }
        
        print(vect);
        

    }
    
    public static void print(ArrayList<String> vect){
        vect.stream()
                .forEach(i -> System.out.println(i));
    }
}
