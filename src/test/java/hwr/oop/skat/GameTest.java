package hwr.oop.skat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.assertj.core.api.Assertions.assertThatCharSequence;

public class GameTest {

    @Test
    public void testGameConstructor()
    {
        Game game = new Game();
        assertSoftly(softly -> {

        });
    }

    @Test
    public void giveCardsTest()
    {
        Game game = new Game();
        game.giveCards();
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        final List<Card> testDeck = cardDeck.getDeck();
        final List<Player> playerList = game.getPlayerList();
        for(Player p : game.getPlayerList())
        {
            assertSoftly(softly ->{
                softly.assertThat(playerList).isNotEmpty();
                softly.assertThat(p.getHandCards()).hasSize(10);
                softly.assertThat(p.getHandCards()).doesNotContainSequence(testDeck);
            });
        }
            assertThat(game.getSkat().size()).isEqualTo(2);

    }

    @Test
    public void layCardTest()
    {

    }
}
