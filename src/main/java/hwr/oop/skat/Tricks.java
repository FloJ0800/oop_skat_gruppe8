package hwr.oop.skat;

import java.util.List;
import java.util.stream.Stream;

public class Tricks {
    List<Card> compareList;


    public Tricks(Stream<Card> pCards) {
        compareList = pCards.toList();

    }
    public Card compareCards() {
        Comperator comp = new Comperator();
        Card firstCheck = comp.getHighestTrick(compareList.getFirst(), compareList.get(1));
        return comp.getHighestTrick(firstCheck, compareList.get(2));
    }

}
