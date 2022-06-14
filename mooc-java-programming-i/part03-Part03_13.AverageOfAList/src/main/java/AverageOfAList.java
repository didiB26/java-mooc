
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        ArrayList<Integer> lista = new ArrayList<>();
        
        while(true){
            int numar = Integer.valueOf(scanner.nextLine());
            if (numar == -1){
                break;
            }
            lista.add(numar);           
        }
        int sum=0;
        int j = lista.size();
        double average = 0.0;
        
        for (int i=0; i<lista.size(); i++){
            sum+=lista.get(i);
        }
        average = (double)sum/j;
        System.out.println("Average: " + average);
        
    }
}
