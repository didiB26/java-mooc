
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = Integer.valueOf(scanner.nextLine());
        int input2 = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(input1, input2);

    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i=beginning; i<=end; i++){
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
        
    }
}
