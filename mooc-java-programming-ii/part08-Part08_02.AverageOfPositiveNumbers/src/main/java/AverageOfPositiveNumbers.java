
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        double average;
        
        while (true) {
            int numar = Integer.valueOf(scanner.nextLine());

            if (numar == 0) {
                break;
            }

            if (numar > 0) {
                sum += numar;
                count++;
            }

        }
        
        if (count == 0){
            System.out.println("Cannot calculate the average");
        } else {
            average = 1.0 * sum / count;
            System.out.println(average);
        }

    }
}
