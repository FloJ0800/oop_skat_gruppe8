package hwr.oop.skat.cli;

import hwr.oop.skat.Card;
import hwr.oop.skat.CardDeck;
import hwr.oop.skat.Game;
import hwr.oop.skat.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        System.out.println("gnampf!");
        final var cli = new OutputOnlyCli(System.out);
        Game game = new Game();
        game.giveCards();

    }

}



