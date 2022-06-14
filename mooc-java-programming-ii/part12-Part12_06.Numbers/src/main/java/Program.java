
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random objRandom = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int numar = Integer.valueOf(scanner.nextLine());
        
        while (numar > 0){
            int nrRandom = objRandom.nextInt(11);
            System.out.println(nrRandom);
            numar --;
            
        }
        
    }

}
