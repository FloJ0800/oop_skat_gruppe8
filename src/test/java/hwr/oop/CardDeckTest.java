package hwr.oop;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class CardDeckTest {
    @Test
    void CardDeck_IsNotEmpty()
    {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        Assertions.assertThat(cardDeck.isEmpty()).isFalse();
    }
    @Test
    void ckeckCardDeck()
    {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
    }
}
