
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numere = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            int input2 = Integer.valueOf(input);

            if (input2 < 0) {
                break;
            }

            numere.add(input2);

        }
      

        numere.stream()
                .filter(i -> i >= 1 && i <= 5)
                .forEach(i -> System.out.println(i));

    }
}
