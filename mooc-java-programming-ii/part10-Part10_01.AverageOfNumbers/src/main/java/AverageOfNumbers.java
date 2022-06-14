
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        
        //counting the nb of vb
        
        //long counter = inputs.stream().mapToInt(s -> Integer.valueOf(s)).count();
        double average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        //System.out.println(counter);
        System.out.println(average);

    }
}
