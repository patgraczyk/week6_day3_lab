import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    private Random randomGenerator;


    public Deck(){
        this.deck = Deck.addCards();
        randomGenerator = new Random();
    }

    public ArrayList<Card> getDeck(){
        return this.deck;
    }

    public Card getRandomCard(){
        int index = randomGenerator.nextInt(this.deck.size());
        Card card = this.deck.get(index);
        return card;
    }

    public int countDeck(){
        return deck.size();
    }

    public static ArrayList<Card> addCards(){
        ArrayList<Card> deck = new ArrayList<Card>();

        SuitType[] allSuits = SuitType.values();
        NumberType[] allNumbers = NumberType.values();

        for (NumberType number : allNumbers) {
            for (SuitType suit : allSuits) {
                Card newCard = new Card(suit, number);
                deck.add(newCard);
            }
        }

        return deck;

    }
}
