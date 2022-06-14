
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPoz = 0;
        int countNeg = 0;
        int count = 0;
        int sum = 0;
        
        while (true) {
            int numar = Integer.valueOf(scanner.nextLine());
             
            if (numar == 0) {
                break;
            }
            
            if (numar < 0) {
                countNeg++;
            }
            
            if (numar > 0) {
                countPoz++;
                sum+=numar;
            }
            
            count++;
                       
        }
        
        if (count == countNeg) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = (double) sum/countPoz;
            System.out.println(average);
        }
    }
}
