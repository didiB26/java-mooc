
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Figurine> list = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identif = scanner.nextLine();

            if (identif.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Figurine fig = new Figurine(identif, name);

            if (list.contains(fig)) {
                continue;
            } else {
                list.add(fig);
            }

        }

        System.out.println("==Items==");

        for (Figurine item : list) {
            System.out.println(item);
        }

    }
}
