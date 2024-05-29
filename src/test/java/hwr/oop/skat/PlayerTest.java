package hwr.oop.skat;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

class PlayerTest {

    @Test
    void createPlayerTest()
    {
        Player player1 = new Player("Juergen", true);
        assertSoftly(softly -> {
            softly.assertThat(player1.getName()).isEqualTo("Juergen");
            softly.assertThat(player1.isAlone()).isEqualTo(true);
            softly.assertThat(player1.getPoints()).isEqualTo(0);
            softly.assertThat(player1.getHandCards()).isEqualTo(new ArrayList<>());
        });
    }

    @Test
    void drawCardTest()
    {
        CardDeck deck = new CardDeck();
        deck.fillList();
        deck.shuffle();
        Player player1 = new Player("Juergen", true);
        int testHandSize = player1.getHandCards().size();
        player1.drawCard(deck.drawFirstCard());
        assertThat(player1.getHandCards()).hasSize(testHandSize+1);
    }

}
