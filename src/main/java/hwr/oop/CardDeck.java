package hwr.oop;
import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> deck = new ArrayList<Card>();

    public void fillList(){
        deck.add(new Card("7", 0, 1,"Karo"));
        deck.add(new Card("8", 0, 2,"Karo"));
        deck.add(new Card("9", 0, 3,"Karo"));
        deck.add(new Card("10", 10, 6,"Karo"));
        deck.add(new Card("Bube", 2, 8,"Karo"));
        deck.add(new Card("Dame", 3, 4,"Karo"));
        deck.add(new Card("König", 4, 5,"Karo"));
        deck.add(new Card("Ass", 11, 7,"Karo"));
        deck.add(new Card("7", 0, 1,"Herz"));
        deck.add(new Card("8", 0, 2,"Herz"));
        deck.add(new Card("9", 0, 3,"Herz"));
        deck.add(new Card("10", 10, 6,"Herz"));
        deck.add(new Card("Bube", 2, 9,"Herz"));
        deck.add(new Card("Dame", 3, 4,"Herz"));
        deck.add(new Card("König", 4, 5,"Herz"));
        deck.add(new Card("Ass", 11, 7,"Herz"));
        deck.add(new Card("7", 0, 1,"Pik"));
        deck.add(new Card("8", 0, 2,"Pik"));
        deck.add(new Card("9", 0, 3,"Pik"));
        deck.add(new Card("10", 10, 6,"Pik"));
        deck.add(new Card("Bube", 2, 10,"Pik"));
        deck.add(new Card("Dame", 3, 4,"Pik"));
        deck.add(new Card("König", 4, 5,"Pik"));
        deck.add(new Card("Ass", 11, 7,"Pik"));
        deck.add(new Card("7", 0, 1,"Kreuz"));
        deck.add(new Card("8", 0, 2,"Kreuz"));
        deck.add(new Card("9", 0, 3,"Kreuz"));
        deck.add(new Card("10", 11, 6,"Kreuz"));
        deck.add(new Card("Bube", 2, 9,"Kreuz"));
        deck.add(new Card("Dame", 3, 4,"Kreuz"));
        deck.add(new Card("König", 4, 5,"Kreuz"));
        deck.add(new Card("Ass", 11, 7,"Kreuz"));




    }
}

