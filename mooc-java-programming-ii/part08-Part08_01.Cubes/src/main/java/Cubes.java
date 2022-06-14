
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String citire = scanner.nextLine();

            if (citire.equals("end")) {
                break;
            }
            
            int numar = 0; 
            try {
                numar = Integer.valueOf(citire);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(numar * numar * numar);
        }
    }
}

