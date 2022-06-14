
import java.util.ArrayList;

public class MessagingService {

    private ArrayList<Message> lista;

    public MessagingService() {
        this.lista = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            lista.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.lista;
    }
}
