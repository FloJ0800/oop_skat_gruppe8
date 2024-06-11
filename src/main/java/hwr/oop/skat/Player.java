package hwr.oop.skat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Player {
    private String name;
    private boolean alone;
    private int points = 0;

    private final List<Card> handCards = new ArrayList<>();

    public Player(String pName, boolean pAlone) {
        name = pName;
        alone = pAlone;
    }

    public Stream<String> getHand()
    {
        List<String> hand = new ArrayList<>();
        for(Card card : handCards)
        {
            hand.add(card.printCard());
        }
        return hand.stream();
    }

    public void setPoints(int newPoints){
        points = newPoints;
    }

    public void drawCard(Card pAddCard){
        handCards.add(pAddCard);
    }

    public String getName() {
        return name;
    }

    public boolean isAlone() {
        return alone;
    }

    public int getPoints() {
        return points;
    }

    public List<Card> getHandCards() {
        return handCards;
    }
}


