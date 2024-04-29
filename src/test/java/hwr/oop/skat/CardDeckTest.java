package hwr.oop.skat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CardDeckTest {
    @Test
    void CardDeck_IsNotEmpty() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        assertThat(cardDeck.isEmpty()).isFalse();
    }

    @Test
    void cardDeckShuffelTest() {
        CardDeck cardDeck = new CardDeck();
        List<Card> checkList = cardDeck.getDeck();
        cardDeck.shuffel();
        assertThat(cardDeck.getDeck()).isNotEqualTo(checkList);

    }
}
