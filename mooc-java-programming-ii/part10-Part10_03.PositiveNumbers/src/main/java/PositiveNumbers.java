
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }
            
            numbers.add(Integer.valueOf(row));
        }
        List<Integer> lista = positive(numbers);
        System.out.println(lista);
    }
    
    

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> newList = numbers.stream().filter(numb -> numb > 0).collect(Collectors.toCollection(ArrayList::new));
        return newList;
    }

}
