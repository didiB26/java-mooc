
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        ArrayList<Bird> lista = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("?");
            String input = scan.nextLine();
            if (input.equals("Quit")) {
                break;
            }
            if (input.equals("Add")) {
                System.out.print("Name: ");
                String input2 = scan.nextLine();
                System.out.println("Name in Latin: ");
                String input3 = scan.nextLine();
                lista.add(new Bird(input2, input3));
                continue;
            }
            if (input.equals("Observation")) {
                System.out.print("Bird? ");
                String input2 = scan.nextLine();
                for (Bird x : lista) {
                    if (x.getName().equals(input2)) {
                        x.counting();
                    }

                }
                continue;
            }
            if (input.equals("All")) {
                for (Bird x : lista) {
                    System.out.println(x);
                }
                continue;
            }
            if (input.equals("One")) {
                System.out.print("Bird? ");
                String input2 = scan.nextLine();
                for (Bird x : lista) {
                    if (x.getName().equals(input2)) {
                        System.out.println(x);
                    }
                }
                continue;
            }

        }

    }

}
