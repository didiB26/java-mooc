
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary words;

    public TextUI(Scanner scanner, SimpleDictionary words) {
        this.scanner = scanner;
        this.words = words;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");

            String text = scanner.nextLine();

            if (text.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (text.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();

                words.add(word, translation);
                continue;

            }

            if (text.equals("search")) {
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                System.out.println("Translation:");

                if (this.words.translate(word) == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println(this.words.translate(word));
                }


                continue;

            }

            System.out.println("Unknown command");

        }
    }

}
