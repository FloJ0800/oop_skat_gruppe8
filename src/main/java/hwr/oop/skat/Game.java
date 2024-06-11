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

    public Game()
    {
        dataManager = new DataManager();
        dataManager.save("Spieler1;Spieler2;Spieler3;Spieler1=solo;");
        dataStream = dataManager.load();
        dataStream.forEach(System.out::println);
    }

    /*
    public void fillPlayerList(){
        dataStream.filter(c -> c.equals("Spieler%"))
            .forEach(System.out::println);
    }
    */

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

    }

    public void lay





























































































    Card(Card pCard)
    {
        layedCards.add(pCard);
        if(layedCards.size() == 3)
        {
            Tricks tricks = new Tricks(layedCards);
        }

    }

    public void loadData()
    {


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

    /*
    public CardDeck getDeck() {
        return deck;
    }
    */
}
