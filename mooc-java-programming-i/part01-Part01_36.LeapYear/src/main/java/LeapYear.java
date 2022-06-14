
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a year: ");
        
        int an = Integer.valueOf(scan.nextLine());
        
        if ( an % 4 != 0 ) {
            System.out.println("The year is not a leap year.");
        } else if ( an%100 == 0 && an%400 != 0) {
            System.out.println("The year is not a leap year.");
        } else {
            System.out.println("The year is a leap year.");
        }
    }
}
