package tests;

import blackjack1.Card;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card testCard = new Card(52);

    @Test
    @DisplayName(" Testing to see if a card score is generated: ")
    public void testGenerateCard(){
        assertEquals(10, testCard.checkCards("jack"));
    }




}
