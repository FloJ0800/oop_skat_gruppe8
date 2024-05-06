package hwr.oop.skat.cli;

import hwr.oop.skat.Card;
import hwr.oop.skat.CardDeck;
import hwr.oop.skat.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        System.out.println("gnampf!");
        final var cli = new OutputOnlyCli(System.out);
        List<Player> playerList = new ArrayList<>();
        List<Card> skat = new ArrayList<>();
        playerList.add(new Player("Katja", true));
        playerList.add(new Player("Florian", false));
        playerList.add(new Player("Moritz", false));
        CardDeck deck = new CardDeck();

        deck.fillList();
        deck.shuffle();

        for(int i = 0; i <= 9; i++){
            for(Player p: playerList){
                p.drawCard(deck.drawFirstCard());
            }
        }

        skat.add(deck.drawFirstCard());
        skat.add(deck.drawFirstCard());

    }

}



