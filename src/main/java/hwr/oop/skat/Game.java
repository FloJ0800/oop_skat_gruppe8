package hwr.oop.skat;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playerList = new ArrayList<>();
    private List<Card> skat = new ArrayList<>();
    private CardDeck deck = new CardDeck();

    public Game()
    {
        playerList.add(new Player("Katja", true));
        playerList.add(new Player("Florian", false));
        playerList.add(new Player("Moritz", false));

        deck.fillList();
        deck.shuffle();
    }

    public void giveCards() //Ersetzen durch einen Stream
    {
        for(int i = 0; i <= 9; i++){
            for(Player p: playerList){
                p.drawCard(deck.drawFirstCard());
            }
        }
        this.skat.add(deck.drawFirstCard());
        this.skat.add(deck.drawFirstCard());
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Card> getSkat() {
        return skat;
    }

    public CardDeck getDeck() {
        return deck;
    }
}
