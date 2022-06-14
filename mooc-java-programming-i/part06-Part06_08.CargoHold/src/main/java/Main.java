
public class Main {

    public static void main(String[] args) {
        Item book = new Item("Lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("brick", 4);
        Item brick2 = new Item("brick2", 1);
        Item brick3 = new Item("brick3", 1);
        Item brick4 = new Item("brick", 1);
        Item brick5 = new Item("brick", 2);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        suitcase.addItem(brick2);
        suitcase.addItem(brick3);
        suitcase.addItem(brick4);
        suitcase.addItem(brick5);
        System.out.println(suitcase);
    }
}
