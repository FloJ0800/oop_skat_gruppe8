package hwr.oop.skat;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Game {
    private List<Player> playerList = new ArrayList<>();
    private List<Card> skat = new ArrayList<>();
    private CardDeck deck = new CardDeck();
    DataManager dataManager;
    List<Card> layedCards = new ArrayList<>();
    Stream<String> dataStream;
    int currentPlayer; //?
    Card winCard;

    public Game()
    {
        dataManager = new DataManager();
        dataManager.save("Spieler1;Spieler2;Spieler3;Spieler1=solo;");
        dataStream = dataManager.load();
        //dataStream.forEach(System.out::println);
    }

    public Game(List<Player> pPlayerList) {
        this.playerList = pPlayerList;
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

    public void layCard(Card pCard)
    {
        layedCards.add(pCard);
        if(layedCards.size() == 3)
        {
            Tricks tricks = new Tricks(layedCards);
            winCard = tricks.compareCards();
        }

    }

    public Card getWinCard() {
        return winCard;
    }

    public List<Card> getLayedCards() {
        return layedCards;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public List<Card> getSkat() {
        return skat;
    }
}
