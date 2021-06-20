package tests;

import blackjack1.Dealer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer = new Dealer();

    @Test
    @DisplayName(" Testing to see if Dealer decision is stick if score is over 17 ")
    public void testDealerDecision(){
        dealer.setScore(18);
        assertEquals("stick", dealer.dealerDecision());
    }
}
