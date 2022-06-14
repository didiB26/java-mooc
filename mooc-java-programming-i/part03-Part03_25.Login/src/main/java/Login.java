
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] user1 = {"alex", "sunshine"};
        String[] user2 = {"emma", "haskell"};

        System.out.println("Enter username: ");
        String nume = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();

        if ((user1[0].equals(nume) && user1[1].equals(pass)) || (user2[0].equals(nume) && user2[1].equals(pass))) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
}
