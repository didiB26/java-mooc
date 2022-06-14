
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        String raspuns;
        int numar = Integer.valueOf(scan.nextLine());
        
        if ( numar > 0 ){
            raspuns="";
        } else {
            raspuns=" not";
        }
        
        System.out.println("The number is" + raspuns + " positive.");
    }
}
