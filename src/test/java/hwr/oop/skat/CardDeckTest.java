package hwr.oop.skat;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCharSequence;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CardDeckTest {
    @Test
    void CardDeck_IsNotEmpty() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        final List<Card> testDeck = new ArrayList<>();

        assertSoftly(softly -> {
            softly.assertThat(cardDeck.isEmpty()).isFalse();
            softly.assertThat(testDeck).isNotEqualTo(cardDeck.getDeck());
            softly.assertThat(cardDeck.getDeck()).isNotEmpty();
        });
    }

    @Test
    void CardDeck_IsEmpty() {
        CardDeck cardDeck = new CardDeck();
        final List<Card> testDeck = new ArrayList<>();

        assertSoftly(softly -> {
            softly.assertThat(cardDeck.isEmpty()).isTrue();
            softly.assertThat(testDeck).isEqualTo(cardDeck.getDeck());
            softly.assertThat(cardDeck.getDeck()).isEmpty();
        });
    }

    @Test
    void cardDeckShuffleTest() {
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        final List<Card> testDeck = cardDeck.getDeck();
        cardDeck.shuffle();
        final List<Card> shuffledDeck = cardDeck.getShuffledDeck();
        int deckSize = cardDeck.getShuffledDeck().size();

        assertSoftly(softly -> {
            softly.assertThat(deckSize).isEqualTo(32);
            softly.assertThat(shuffledDeck).doesNotContainSequence(testDeck);

        });


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

        assertSoftly(softly -> {
            softly.assertThat(cardDeck.getShuffledDeck()).hasSize(31);
            softly.assertThat(firstCard).isEqualTo(testFirstCard);
        });
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
