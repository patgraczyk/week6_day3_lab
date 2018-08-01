import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCard {

    Card fiveOfSpades;

    @Before
    public void before(){
        fiveOfSpades = new Card(SuitType.SPADE, NumberType.FIVE);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.SPADE, fiveOfSpades.getSuit());
    }

    @Test
    public void hasNumber(){
        assertEquals(NumberType.FIVE, fiveOfSpades.getNumber());
    }

}
