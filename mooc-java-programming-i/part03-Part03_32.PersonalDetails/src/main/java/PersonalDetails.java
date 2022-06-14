
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int count = 0;
        String nume = "";
        int marime = 0;
        double average = 0.0;

        while (true) {
            String scan = scanner.nextLine();
            if (scan.equals("")) {
                break;
            }
            String[] vect = scan.split(",");
            String num = vect[0];
            int an = Integer.valueOf(vect[1]);
            suma += an;
            count++;

            if (num.length() > marime) {
                marime = num.length();
                nume = vect[0];
            }
        }
        System.out.println("Longest name: " + nume);
        average = (1.0) * suma/count;
        System.out.println("Average of the birth years: " + average);

    }
}
