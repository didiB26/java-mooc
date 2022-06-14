
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (1<2) {
            System.out.println("Give a number:");
            int numar = Integer.valueOf(scanner.nextLine());
            
            if (numar < 0){
                System.out.println("Unsuitable number");
            } else if (numar > 0) {
                System.out.println(numar * numar);
            } else {
                break;
            }
            
        }
    }
}
