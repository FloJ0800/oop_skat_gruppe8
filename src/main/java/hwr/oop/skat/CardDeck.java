package hwr.oop.skat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    private List<Card> deck = new ArrayList<Card>();
    private List<Card> shuffledDeck = new ArrayList<Card>();
    private List<Color> deckColor = Color.allColors();
    private List<Symbol> deckSymbol = Symbol.allSymbols();

    public void fillList() {
        for (Color i : deckColor) {
            for (Symbol j : deckSymbol) {
                deck.add(new Card(j, i));
            }
        }
    }

    @Override
    public String toString() {
        return "CardDeck{" +
                "deck=" + deck +
                ", shuffledDeck=" + shuffledDeck +
                ", deckColor=" + deckColor +
                ", deckSymbol=" + deckSymbol +
                '}';
    }

    public void shuffle() {
        List<Card> copy = new ArrayList<>(deck);
        Collections.shuffle(copy);
        this.shuffledDeck = copy;
    }

    public boolean isEmpty() {
        return deck.isEmpty();
    }

    public List<Card> getDeck() {
        return deck;
    }

    public List<Card> getShuffledDeck() {
        return shuffledDeck;
    }

    public List<Color> getDeckColor() {
        return deckColor;
    }

    public List<Symbol> getDeckSymbol() {
        return deckSymbol;
    }

    public Card drawFirstCard(){
        try
        {
            Card drawCard = shuffledDeck.getFirst();
            shuffledDeck.removeFirst();
            return drawCard;
        }
        catch(Exception e)
        {
            return null;
        }

    }
}

