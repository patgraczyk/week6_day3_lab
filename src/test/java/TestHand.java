import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHand {

    Player player1;
    Card card1;

    @Before
    public void before(){
        player1 = new Player();
        card1 = new Card(SuitType.SPADE, NumberType.ACE);
    }

    @Test
    public void handIsEmpty(){
        assertEquals(0, player1.countHand());
    }

    @Test
    public void handHasCard(){
        player1.addCardToHand(card1);
        assertEquals(1, player1.countHand());
    }

    @Test
    public void returnFirstCard(){
        player1.addCardToHand(card1);
        assertEquals(card1, player1.getFirstCard());
    }



}
