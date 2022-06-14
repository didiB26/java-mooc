
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int win = 0;
        int loss = 0;
        ArrayList<String> vector = new ArrayList<>();

        System.out.println("File: ");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        try {
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNextLine()) {
                String linie = sc.nextLine();
                vector.add(linie);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        for (String x : vector) {
            String[] vect = x.split(",");

            int prim = Integer.valueOf(vect[2]);
            int sec = Integer.valueOf(vect[3]);
            if (vect[0].equals(team)) {
                count++;
                if (prim < sec) {
                    loss++;
                } else {
                    win++;
                }
            }

            if (vect[1].equals(team)) {
                count++;
                if (prim > sec) {
                    loss++;
                } else {
                    win++;
                }
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + loss);

    }
}
