
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        while (true) {
            System.out.println("Give a number:");
            int numar = Integer.valueOf(scanner.nextLine());
            
            if (numar == 0) {
                break;
            }
            
            if (numar < 0) {
                count++;
            }
            
        }
        
        System.out.println("Number of negative numbers: " + count);
    }
}
