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

    public void printCards() {
        for (Card i : deck) {
            System.out.println(i.printCard());
        }
    }

    public void shuffle() {
        this.shuffledDeck = deck;
        Collections.shuffle(shuffledDeck);
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

    public Card drawFirstCard(){
        if(shuffledDeck.isEmpty()) {
            throw new RuntimeException("Karten alle!");
        }
        else{
            Card drawCard = shuffledDeck.getFirst();
            shuffledDeck.removeFirst();
            return drawCard;
        }
    }
}

