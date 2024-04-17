package hwr.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CardsTest {

    @Test
    void testConstructorNumber()
    {
        Card card = new Card(10,10);
        int result = card.getName();
        int resultValue = card.getValue();
        Assertions.assertThat(resultValue).isEqualTo(10);
        Assertions.assertThat(result).isEqualTo(10);
    }


}
