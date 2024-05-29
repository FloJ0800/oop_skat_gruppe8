package hwr.oop.skat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {

    private ArrayList<Player> players = new ArrayList<>();
    private Game game;

    private Scanner s = new Scanner(System.in);

    public void menu()
    {
        System.out.println("Willkommen zu Skat von Gruppe 8! \n Du hast folgende Optionen: \n 1. Starte ein neues Spiel ");
        if(s.nextInt() == 1)
        {
            System.out.println("Neues Spiel wird gestartet");
            spielerNamen();
        }
    }

    public void spielerNamen()
    {
        System.out.println("Spieler 1 gebe deinen Namen ein:");
        try {
            String skip = s.nextLine();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        players.add(new Player(s.nextLine(), true));
        System.out.println("Spieler 2 gebe deinen Namen ein:");
        players.add(new Player(s.nextLine(), false));
        System.out.println("Spieler 3 gebe deinen Namen ein:");
        players.add(new Player(s.nextLine(), false));
        game = new Game(players);
        play();

    }

    public void play()
    {
        System.out.println("Karten werden verteilt");
        game.giveCards();
        turn();
    }

    public void turn()
    {
        System.out.println(game.getPlayersTurn().getName() + ", bist du bereit? Schreib einfach 'y' ");
        if(s.nextLine().equals("y"))
        {
            Stream<String> playerHandCards = game.getPlayersTurn().getHand();
            playerHandCards.forEach(System.out::println);
            game.nextPlayer();
        }
        else
        {
            System.out.println("Keine gültige Eingabe!");
            turn();
        }
        turn();
    }

}
