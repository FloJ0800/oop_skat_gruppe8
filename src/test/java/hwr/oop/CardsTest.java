package hwr.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    void testConstructorNumber()
    {
        Card card = new Card("10",10, 8,"Karo");
        String resultName = card.getName();
        int resultCountValue = card.getCountValue();
        int resultBattleValue = card.getBattleValue();
        String resultColor = card.getColor();

        Assertions.assertThat(resultName).isEqualTo("10");
        Assertions.assertThat(resultCountValue).isEqualTo(10);
        Assertions.assertThat(resultBattleValue).isEqualTo(8);
        Assertions.assertThat(resultColor).isEqualTo("Karo");
    }


}
