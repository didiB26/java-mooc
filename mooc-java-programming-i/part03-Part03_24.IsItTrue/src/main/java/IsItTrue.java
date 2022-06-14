
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String cuv = scanner.nextLine();
        
        if(cuv.equals("true")){
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }
}
