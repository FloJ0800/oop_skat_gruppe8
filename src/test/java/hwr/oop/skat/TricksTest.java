package hwr.oop.skat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TricksTest {
    @Test
    public void tricksConstructorTest() {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Symbol.NEUN, Color.KREUZ));
        cards.add(new Card(Symbol.ZEHN, Color.KREUZ));
        cards.add(new Card(Symbol.ZEHN, Color.KARO));
        Tricks trick = new Tricks(cards);
        Card winCard = trick.compareCards();
        Assertions.assertThat(trick.getCompareList()).hasSize(3);
        Assertions.assertThat(winCard).isEqualTo(cards.get(1));

    }
}
