
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ArrayList<Integer> points = new ArrayList<>();
        
        GradeRegister gr = new GradeRegister();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            String input = scanner.nextLine();
            Integer input2 = Integer.valueOf(input);

            if (input2 == -1) {
                break;
            }

            gr.adder(input2);
            gr.adderGrades(input2);
        }

        System.out.println("Point average (all): " + gr.averagePoints());
        
        System.out.print("Point average (passing): ");
        gr.averagePointsByGrade();
        
        System.out.println("Pass percentage: " + gr.passPercentage());
        gr.gradeDistribution();

    }

    

}
