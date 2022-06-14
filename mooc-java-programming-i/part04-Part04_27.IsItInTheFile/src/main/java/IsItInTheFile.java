
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean vb = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> lista = new ArrayList<>();

        try {
            Scanner scan = new Scanner(Paths.get(file));
            while (scan.hasNextLine()) {
                lista.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

        for (int i=0; i<lista.size(); i++ ){
            if (searchedFor.equals(lista.get(i))){
                vb = true;
            }
        }
        
        if (vb){
            System.out.println("Found!");
        } else 
            System.out.println("Not found.");

    }
}
