package hwr.oop;

import org.junit.jupiter.api.Test;

public class CardDeckTest {
    @Test
    void CardDeck_IsNotEmpty()
    {
        CardDeck cardDeck = new CardDeck();
        assertThat(cardDeck.isEmpty()).isFalse();
    }
}
