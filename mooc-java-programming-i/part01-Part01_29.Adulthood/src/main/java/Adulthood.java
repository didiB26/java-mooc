
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("How old are you?");
        String raspuns;
        int numar = Integer.valueOf(scan.nextLine());
        
        if ( numar >= 18 ){
            raspuns="";
        } else {
            raspuns=" not";
        }
        
        System.out.println("You are" + raspuns + " an adult");
    }
}
