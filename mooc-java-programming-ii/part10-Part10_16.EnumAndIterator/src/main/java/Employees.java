
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    List<Person> lista;

    public Employees() {
        this.lista = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        this.lista.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> it = peopleToAdd.iterator();

        while (it.hasNext()) {
            this.lista.add(it.next());
        }

    }

    public void print() {
        Iterator<Person> it = this.lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> it = this.lista.iterator();

        while (it.hasNext()) {
            Person pers = it.next();
            Education educ = pers.getEducation();
            if (educ.equals(education)) {
                System.out.println(pers);
            }

        }
    }

    public void fire(Education education) {
        Iterator<Person> it = this.lista.iterator();

        while (it.hasNext()) {
            Person pers = it.next();
            Education educ = pers.getEducation();
            if (educ.equals(education)) {
                it.remove();
            }
        }
    }

}
