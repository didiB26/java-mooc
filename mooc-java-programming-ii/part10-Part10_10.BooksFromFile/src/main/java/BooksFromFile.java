
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(readBooks("test.txt"));
        
    }

    public static List<Book> readBooks(String file) {
        List<Book> lista = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(i -> i.split(","))
                    .filter(x -> x.length >= 4)
                    .map(a -> new Book(a[0], Integer.valueOf(a[1]), Integer.valueOf(a[2]), a[3]))
                    .forEach(book -> lista.add(book));

        } catch (Exception e) {
            System.out.println(e);
        }
        return lista;
    }

}
