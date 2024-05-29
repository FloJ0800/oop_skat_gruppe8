package hwr.oop.skat;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

class CardsTest {

    @Test
    void testConstructorNumber() {
        Card card = new Card(Symbol.ZEHN, Color.KARO);
        Symbol resultSymbol = card.getSymbol();
        int resultCountValue = card.getCountValue();
        int resultBattleValue = card.getBattleValue();
        boolean resultTrump = card.isTrump();
        Color resultColor = card.getColor();

        assertSoftly(softly -> {
            softly.assertThat(resultSymbol).isEqualTo(Symbol.ZEHN);
            softly.assertThat(resultCountValue).isEqualTo(10);
            softly.assertThat(resultBattleValue).isEqualTo(5);
            softly.assertThat(resultColor).isEqualTo(Color.KARO);
            softly.assertThat(resultTrump).isEqualTo(false);
        });
    }

    @Test
    void testPrintCard() {
        Card card = new Card(Symbol.ZEHN, Color.KARO);
        String compareString = Color.KARO.toString() + " " + Symbol.ZEHN.toString();
        assertThat(card.printCard()).isEqualTo(compareString);
    }

    @Test
    void testSetTrump()
    {
        Card card = new Card(Symbol.ZEHN, Color.KARO);
        card.setTrump(true);
        assertThat(card.isTrump()).isEqualTo(true);
    }

}
