package hwr.oop.skat;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;

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
        for(Player p : game.getPlayerList())
        {
            assertThat(p.getHandCards()).hasSize(10);
        }
        assertThat(game.getSkat().size()).isEqualTo(2);
    }

}
