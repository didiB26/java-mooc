
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int first = 0;
        int second = 0;

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (input.equals("quit")) {
                break;
            }

            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                if (amount < 0) {
                    continue;
                }
                if (first + amount > 100) {
                    first = 100;
                    continue;
                }

                first = first + amount;
            } else if (command.equals("move")) {
                if (amount < 0) {
                    continue;
                }
                if (second + amount > 100) {
                    second = 100;
                    if (first - amount <= 0) {
                        first = 0;
                        //continue;
                    }
                    continue;
                }

                if (amount > first) {
                    if (first == 0) {
                        continue;
                        
                    }
                    
                    if (second + amount > 100) {
                        second = 100;
                        continue;
                    }
                    second = second + first;
                    first = 0;
                    
                    continue;
                }

                first = first - amount;
                second = second + amount;
                
            } else if (command.equals("remove")) {
                if (amount < 0){
                    continue;
                }
                if (amount > second) {
                    second = 0;
                    continue;
                }
                second = second - amount;
            }
        }

        //System.out.println(first);
        //System.out.println(second);
    }

}
