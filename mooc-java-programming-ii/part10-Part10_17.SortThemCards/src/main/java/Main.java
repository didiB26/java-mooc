
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // test your code here
        List<Card> lista = new ArrayList<>();
        Card first1 = new Card(2, Suit.SPADE);
        Card first = new Card(2, Suit.DIAMOND);
        Card second = new Card(14, Suit.SPADE);
        Card third = new Card(12, Suit.HEART);

        //System.out.println(first1.compareTo(third));
        //System.out.println(first1.compareTo(first));
        lista.add(first1);
        lista.add(first);
        lista.add(second);
        lista.add(third);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        Collections.sort(lista);

        System.out.println(lista);

        Hand hand = new Hand();

        hand.add(new Card(2, Suit.DIAMOND));
        hand.add(new Card(14, Suit.SPADE));
        hand.add(new Card(12, Suit.HEART));
        hand.add(new Card(2, Suit.SPADE));

        hand.print();

        hand.sort();

        hand.print();

        System.out.println("+++++++");

        Hand hand1 = new Hand();

        hand1.add(new Card(2, Suit.DIAMOND));
        hand1.add(new Card(14, Suit.SPADE));
        hand1.add(new Card(12, Suit.HEART));
        hand1.add(new Card(2, Suit.SPADE));

        Hand hand2 = new Hand();

        hand2.add(new Card(11, Suit.DIAMOND));
        hand2.add(new Card(11, Suit.SPADE));
        hand2.add(new Card(11, Suit.HEART));

        int comparison = hand1.compareTo(hand2);
        System.out.println(comparison);

        if (comparison < 0) {
            System.out.println("better hand is");
            hand2.print();
        } else if (comparison > 0) {
            System.out.println("better hand is");
            hand1.print();
        } else {
            System.out.println("hands are equal");
        }
        System.out.println("");

        System.out.println("punctu 5");

        ArrayList<Card> cards = new ArrayList<>();

        cards.add(new Card(3, Suit.SPADE));
        cards.add(new Card(2, Suit.DIAMOND));
        cards.add(new Card(14, Suit.SPADE));
        cards.add(new Card(12, Suit.HEART));
        cards.add(new Card(2, Suit.SPADE));

        SortBySuit sortBySuitSorter = new SortBySuit();
        Collections.sort(cards, sortBySuitSorter);

        cards.stream().forEach(c -> System.out.println(c));

        System.out.println("++++noua met");

        BySuitInValueOrder x = new BySuitInValueOrder();
        Collections.sort(cards, x);

        cards.stream().forEach(c -> System.out.println(c));

        System.out.println("---------");
        BySuitInValueOrder comparator = new BySuitInValueOrder();
        Card firstw = new Card(4, Suit.HEART);
        Card secondw = new Card(5, Suit.HEART);
        System.out.println(comparator.compare(firstw, secondw));

    }
}
