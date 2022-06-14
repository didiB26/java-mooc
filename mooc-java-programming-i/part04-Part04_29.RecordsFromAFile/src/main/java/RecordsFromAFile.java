
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Name of the file: ");
        
        String file = scanner.nextLine();
        try {
            Scanner sc = new Scanner(Paths.get(file));
            while (sc.hasNextLine()){
                String testi = sc.nextLine();
                if (testi.isEmpty()){
                    continue;
                }
            String[] vect = testi.split(",");
            System.out.println(vect[0] + ", age: " + vect[1] + " years");

            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
               
        

    }
}
