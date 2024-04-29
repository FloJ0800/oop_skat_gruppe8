package hwr.oop.skat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardDeckTest {
    @Test
    void CardDeck_IsNotEmpty() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        assertThat(cardDeck.isEmpty()).isFalse();
    }

    @Test
    void checkCardDeck() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();

    }
}
