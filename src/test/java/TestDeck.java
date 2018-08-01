import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDeck {

    Deck cardDeck;

    @Before
    public void before(){
        cardDeck = new Deck();
    }

//    @Test
//    public void testDeckEmpty(){
//        assertEquals(0, cardDeck.countDeck());
//    }

    @Test
    public void testDeckFull(){
        assertEquals(52, Deck.addCards().size());
    }
}
