
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String text = scanner.nextLine();

            if (text.equals("")) {
                break;
            }

            String[] vect = text.split(" ");
            for (int i = 0; i < vect.length; i++) {
                if (vect[i].contains("av")) {
                    System.out.println(vect[i]);
                }
            }
        }

    }
}
