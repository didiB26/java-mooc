
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numar = Integer.valueOf(scanner.nextLine());
        
        for (int i=numar; i<=100; i++) {
            System.out.println(i);
        }

    }
}
