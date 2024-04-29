package hwr.oop.skat;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> deck = new ArrayList<Card>();
    private List<Color> deckColor = Color.allColors();
    private List<Symbol> deckSymbol = Symbol.allSymbols();

    public void fillList() {
        for(Color i : deckColor){
            for(Symbol j : deckSymbol){
                deck.add(new Card(j, i));
            }
        }
    }

    //public void printCards(){
        //for(Card i : deck){
           // i.printCard();
        //}
    //}

    public boolean isEmpty() {
        return deck.isEmpty();
    }
}

