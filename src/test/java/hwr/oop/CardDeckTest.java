package hwr.oop;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import java.util.*;

public class CardDeckTest {
    @Test
    void CardDeck_IsNotEmpty()
    {
        CardDeck cardDeck = new CardDeck();
        Assertions.assertThat(cardDeck.isEmpty()).isFalse();
    }
}
