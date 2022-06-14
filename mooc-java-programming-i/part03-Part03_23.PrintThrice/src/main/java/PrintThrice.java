
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        String cuv = scanner.nextLine();
        
        for(int n=0; n<3; n++){
            System.out.print(cuv);
        }

    }
}
