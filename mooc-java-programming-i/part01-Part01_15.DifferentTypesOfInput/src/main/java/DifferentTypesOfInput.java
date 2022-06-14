
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String mesaj = scan.nextLine();
        System.out.println("Give an integer:");
        int numar = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double numar2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bu = Boolean.valueOf(scan.nextBoolean());
        
        System.out.println("You gave the string " + mesaj);
        System.out.println("You gave the integer " + numar);
        System.out.println("You gave the double " + numar2);
        System.out.println("You gave the boolean " + bu);
    }
}
