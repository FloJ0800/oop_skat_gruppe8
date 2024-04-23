package hwr.oop.skat;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class CardsTest {

    @Test
    void testConstructorNumber() {
        Card card = new Card(Symbol.ZEHN, Color.KARO);
        Symbol resultSymbol = card.getSymbol();
        int resultCountValue = card.getCountValue();
        int resultBattleValue = card.getBattleValue();
        Color resultColor = card.getColor();

        assertSoftly(softly->{
            softly.assertThat(resultSymbol).isEqualTo(Symbol.ZEHN);
            softly.assertThat(resultCountValue).isEqualTo(10);
            softly.assertThat(resultBattleValue).isEqualTo(6);
            softly.assertThat(resultColor).isEqualTo(Color.KARO);
        });
    }


}
