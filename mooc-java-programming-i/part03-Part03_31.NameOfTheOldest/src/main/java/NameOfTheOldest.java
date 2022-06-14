
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mare = 0;
        String nume = "";
        while (true) {
            String scan = scanner.nextLine();
            if (scan.equals("")) {
                break;
            }

            String[] vect = scan.split(",");

            int age = Integer.valueOf(vect[1]);

            if (age > mare) {
                mare = age;
                nume = vect[0];
            }
        }
        System.out.println("Name of the oldest: " + nume);

    }
}
