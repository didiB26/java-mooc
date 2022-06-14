
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true){
            int numar = Integer.valueOf(scanner.nextLine());
            if (numar == 9999){
                break;
            }
            list.add(numar); 
        }
        int j = 0;
        int mic = list.get(0);

        for (int i=0; i<list.size(); i++){
            if (mic > list.get(i)){
                mic = list.get(i);
                j = i;
            }
        }


        System.out.println("Smallest number: " + mic);        
        System.out.println("Found at index: " + j);


        
    }
}
