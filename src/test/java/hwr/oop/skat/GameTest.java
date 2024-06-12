package hwr.oop.skat;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;
import static org.assertj.core.api.Assertions.assertThatCharSequence;

public class GameTest {

    @Test
    public void testGameConstructor()
    {
        Game game = new Game();
        game.dataManager = new DataManager();
        game.dataManager.save("Spieler1;Spieler2;Spieler3;Spieler1=solo;");
        game.dataStream = game.dataManager.load();
        assertSoftly(softly -> {
            softly.assertThat(game.dataStream).isNotEmpty();
        });
    }

    @Test
    public void giveCardsTest()
    {
        List<Player> testPlayerList = new ArrayList<>();
        testPlayerList.add(new Player("Spieler1", true));
        testPlayerList.add(new Player("Spieler2", false));
        testPlayerList.add(new Player("Spieler3", false));
        Game game = new Game(testPlayerList);
        game.giveCards();
        CardDeck cardDeck = new CardDeck();
        cardDeck.fillList();
        final List<Card> testDeck = cardDeck.getDeck();
        final List<Player> playerList = game.getPlayerList();
        Assertions.assertThat(game.getPlayerList()).isEqualTo(testPlayerList);
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
        Game game = new Game();
        Card card = new Card(Symbol.ZEHN,Color.KARO);
        Card card2 = new Card(Symbol.NEUN,Color.KARO);
        Card card3 = new Card(Symbol.ACHT,Color.PIK);
        int layedCardCount = game.layedCards.size();
        game.layCard(card);

        assertThat(game.getLayedCards().size()).isEqualTo(layedCardCount + 1);
        assertThat(game.getLayedCards().getLast()).isEqualTo(card);
        game.layCard(card2);
        game.layCard(card3);
        assertThat(game.getWinCard()).isEqualTo(card);
    }
}
