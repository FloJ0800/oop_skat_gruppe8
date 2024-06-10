package hwr.oop.skat;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playerList = new ArrayList<>();
    private List<Card> skat = new ArrayList<>();
    private CardDeck deck = new CardDeck();
    private Player playersTurn;
    private int playersMove = 0;

    public Game()
    {
        playerList.add(new Player("Player1",true));
        playerList.add(new Player("Player2",false));
        playerList.add(new Player("Player3",false));

    }

    public void giveCards() //Ersetzen durch einen Stream
    {
        deck.fillList();
        deck.shuffle();

        for(int i = 0; i <= 9; i++){
            for(Player p: playerList){
                p.drawCard(deck.drawFirstCard());
            }
        }
        this.skat.add(deck.drawFirstCard());
        this.skat.add(deck.drawFirstCard());

        playersTurn = playerList.get(playersMove);
    }

    public void layCard()
    {
        Tricks tricks = new Tricks();
        DataManager dataManager = new DataManager();
    }

    public Player getPlayersTurn() {
        return playersTurn;
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
