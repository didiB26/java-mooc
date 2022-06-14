
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {

    public static void main(String[] args) {

        ArrayList<Litera> lista = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(i -> i.split(","))
                    .sorted((x, y) -> x[5].compareTo(y[5]))
                    .map(part -> new Litera(part[3].trim(), Integer.valueOf(part[4]), part[2].split(" ")[1].trim(), Double.valueOf(part[5])))
                    .forEach(litera -> lista.add(litera));

        } catch (Exception e) {
            System.out.println(e);
        }

        //Collections.sort(lista, (p1, p2) -> (((int) p1.getPercent() * 1000 - (int) p2.getPercent() * 1000)));

        for (Litera line : lista) {
            System.out.println(line);
        }

    }
}
