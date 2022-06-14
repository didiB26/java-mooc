
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numar1 = Integer.valueOf(scanner.nextLine());
        int numar2 = Integer.valueOf(scanner.nextLine());
        
        if (numar1 > numar2) {
            System.out.println(numar1 + " is greater than " + numar2 + ".");
        } else if (numar1 < numar2) {
            System.out.println(numar1 + " is smaller than " + numar2 + ".");
        } else {
            System.out.println(numar1 + " is equal to " + numar2 + ".");
        }
    }
}
