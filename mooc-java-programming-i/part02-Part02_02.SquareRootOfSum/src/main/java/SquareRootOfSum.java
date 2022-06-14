
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numar1 = Integer.valueOf(scanner.nextLine());
        int numar2 = Integer.valueOf(scanner.nextLine());
        
        double rad = Math.sqrt(numar1 + numar2);
        
        System.out.println(rad);

    }
}
