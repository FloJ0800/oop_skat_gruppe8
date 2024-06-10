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

    public Game()
    {
        dataManager = new DataManager();
        dataManager.save("Spieler1;Spieler2;Spieler3");
        Stream<String> dataStream = dataManager.load();
        dataStream.forEach(System.out::println);
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

    }

    public void layCard()
    {
        Tricks tricks = new Tricks();
        DataManager dataManager = new DataManager();
    }

    public void loadData()
    {


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
