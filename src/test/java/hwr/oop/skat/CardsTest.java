package hwr.oop.skat;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

public class CardsTest {

    @Test
    void testConstructorNumber() {
        Card card = new Card("10", 10, 6, "Karo");
        String resultName = card.getName();
        int resultCountValue = card.getCountValue();
        int resultBattleValue = card.getBattleValue();
        String resultColor = card.getColor();

        assertSoftly(softly->{
            softly.assertThat(resultName).isEqualTo("10");
            softly.assertThat(resultCountValue).isEqualTo(10);
            softly.assertThat(resultBattleValue).isEqualTo(6);
            softly.assertThat(resultColor).isEqualTo("Karo");
        });
    }


}
