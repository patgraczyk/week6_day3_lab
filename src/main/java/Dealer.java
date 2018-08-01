import java.util.ArrayList;

public class Dealer {
    private Deck deck;
    private ArrayList<Player> players;

    public Dealer(){
        this.deck = new Deck();
        this.players = new ArrayList<Player>();
    }

    public int countPlayers(){
        return this.players.size();
    }

    public int countDeck(){
        return this.deck.countDeck();
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public ArrayList<Card> showDeck(){
        return this.deck.getDeck();
    }

    public Card dealCard(){
        return this.deck.getRandomCard();
    }

}
