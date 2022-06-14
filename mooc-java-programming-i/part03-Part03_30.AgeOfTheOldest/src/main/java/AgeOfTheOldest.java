
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mare = 0;
        while(true){
            String scan = scanner.nextLine();
            if (scan.equals("")){
                break;
            }
            
            String[] vect = scan.split(",");
            
            int age = Integer.valueOf(vect[1]);
            
            if (age > mare){
                mare = age;
            }
        }
        System.out.println("Age of the oldest: " + mare);
    }
}
