package hwr.oop.skat;

import java.util.List;
import java.util.stream.Stream;

public class Tricks {
    List<Card> compareList;


    public Tricks(List<Card> pCards) {
        compareList = pCards;

    }
    public Card compareCards() {
        Comparator comp = new Comparator();
        Card firstCheck = comp.getHighestTrick(compareList.getFirst(), compareList.get(1));
        return comp.getHighestTrick(firstCheck, compareList.get(2));
    }

    public List<Card> getCompareList() {
        return compareList;
    }
}
