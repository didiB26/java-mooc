
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Book> carti = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            
            String input2 = scanner.nextLine();
            if (input2.isEmpty()){
                input2 = "0";
            }
            int input3 = Integer.valueOf(input2); 
            
            carti.add(new Book(input, input3));

        }
        System.out.println("");
        System.out.println(carti.size() + " books in total.");
        System.out.println("");
 /*       
        Comparator<Film> comparator = Comparator
              .comparing(Film::getReleaseYear)
              .thenComparing(Film::getName);

Collections.sort(films, comparator);
*/
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getTitle);
        
        Collections.sort(carti, comparator);
 
        System.out.println("Books: ");
        for( Book x : carti){
            System.out.println(x);
        }
        
        
        

    }

}
