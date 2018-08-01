import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDealer {

    Dealer dealer1;
    Player player1;
    Player player2;

    @Before
    public void before(){
        dealer1 = new Dealer();
        player1 = new Player();
        player2 = new Player();
    }

    @Test
    public void isDeckFull(){
        assertEquals(52, dealer1.showDeck().size());
    }


    // This test will error. You can look at Actual in the test log to see which card object was returned.
    // The card object changes each time you run the test
    @Test
    public void dealCard(){
        assertEquals(1, dealer1.dealCard());
    }

}
