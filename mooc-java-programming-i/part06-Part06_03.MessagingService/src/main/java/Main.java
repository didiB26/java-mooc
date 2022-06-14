
public class Main {

    public static void main(String[] args) {

        MessagingService x = new MessagingService();
        Message primu = new Message("trimis", "text mult");
        x.add(primu);
        System.out.println(x.getMessages());
        
    }
}
