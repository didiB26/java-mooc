
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (this.room.isEmpty()) {
            return true;
        }

        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }

        Person pers = this.room.get(0);

        for (Person person : this.room) {
            if (pers.getHeight() > person.getHeight()) {
                pers = person;
            }
        }
        return pers;
    }

    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person pers = this.room.get(0);

        for (Person person : this.room) {
            if (pers.getHeight() > person.getHeight()) {
                pers = person;
            }
        }
        this.room.remove(pers);
        return pers;
    }
}
