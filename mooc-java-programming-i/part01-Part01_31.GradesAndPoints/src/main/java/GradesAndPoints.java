
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points [0-100]:");
        
        int nota = Integer.valueOf(scan.nextLine());
        String rasp;
        if (nota < 0) {
            rasp = "impossible!";
        } else if (nota <= 49) {
            rasp = "failed";
        } else if (nota <= 59) {
            rasp = "1";
        } else if (nota <= 69) {
            rasp = "2";
        } else if (nota <= 79) {
            rasp = "3";
        } else if (nota <= 89) {
            rasp = "4";
        } else if (nota <= 100) {
            rasp = "5";
        } else {
            rasp = "incredible!";
        }
        
        System.out.println("Grade: " + rasp);
    }
}
