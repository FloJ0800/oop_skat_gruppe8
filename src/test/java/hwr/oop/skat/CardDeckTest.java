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
    void cardDeckShuffleTest() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        cardDeck.shuffle();
        int deckSize = cardDeck.getShuffledDeck().size();
        assertThat(deckSize).isEqualTo(32);

    }

    @Test
    void cardDeckTest() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        int deckSize = cardDeck.getDeck().size();
        assertThat(deckSize).isEqualTo(32);

    }
}
