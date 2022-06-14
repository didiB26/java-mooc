
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> lista = new ArrayList<>();

        try {
            Scanner scan = new Scanner(Paths.get(file));
            while (scan.hasNextLine()) {
                lista.add(Integer.valueOf(scan.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        for (int i = 0; i < lista.size(); i++) {
            if ((lista.get(i) >= lowerBound) && (lista.get(i) <= upperBound)) {
                counter++;
            }

        }
        System.out.println("Numbers: " + counter);
    }
}