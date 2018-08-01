import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<Card>();
    }

    public int countHand(){
        return hand.size();
    }

    public Card getFirstCard(){
        return this.hand.get(0);
    }

    public void addCardToHand(Card card){
        hand.add(card);
    }


}
