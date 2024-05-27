package hwr.oop.skat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void drawFirstCardTest()
    {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        cardDeck.shuffle();
        Card testFirstCard = cardDeck.getShuffledDeck().getFirst();
        Card firstCard = cardDeck.drawFirstCard();
        assertThat(cardDeck.getShuffledDeck().size()).isEqualTo(31);
        assertThat(firstCard).isEqualTo(testFirstCard);
    }

    @Test
    void drawFirstCardCatchExceptionTest()
    {

        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        Card testFirstCard = cardDeck.drawFirstCard();
        assertThat(testFirstCard).isNull();
    }

    @Test
    void toStringTest()
    {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        cardDeck.shuffle();
        String testString = "CardDeck{" +
                "deck=" + cardDeck.getDeck() +
                ", shuffledDeck=" + cardDeck.getShuffledDeck() +
                ", deckColor=" + cardDeck.getDeckColor() +
                ", deckSymbol=" + cardDeck.getDeckSymbol() +
                '}';
        assertThat(cardDeck.toString()).isEqualTo(testString);
    }
}
