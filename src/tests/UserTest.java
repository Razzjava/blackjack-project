package tests;

import blackjack1.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {
    private User user = new User();

    @Test
    @DisplayName(" Testing to see if user card is set ")
    public void testDealerDecision(){
        user.setCard("jack");
        assertEquals("jack, ", user.getCards());
    }
}
