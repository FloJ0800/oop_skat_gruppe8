package hwr.oop.skat;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> playerList = new ArrayList<>();
    private List<Card> skat = new ArrayList<>();
    private CardDeck deck = new CardDeck();
    private Player playersTurn;
    private int playersMove = 0;

    public Game(ArrayList<Player> pPlayers)
    {
        playerList.addAll(pPlayers);
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

        playersTurn = playerList.get(playersMove);
    }

    public Player getPlayersTurn() {
        return playersTurn;
    }

    public void nextPlayer()
    {
        playersMove++;
        if(playersMove == playerList.size()){
            playersMove = 0;
        }
        playersTurn = playerList.get(playersMove);
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
