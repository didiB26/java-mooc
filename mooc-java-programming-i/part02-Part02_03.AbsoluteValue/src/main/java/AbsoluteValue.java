
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numar = Integer.valueOf(scanner.nextLine());

        
        if (numar < 0) {
            System.out.println(numar * -1);
        } else {
            System.out.println(numar);
        }



    }
}
