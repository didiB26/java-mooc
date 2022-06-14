package FlightControl;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightControl fl = new FlightControl();
        
        TextUI ui = new TextUI(fl, scanner);
        
        ui.start();
        
    }
}
