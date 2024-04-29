package hwr.oop.skat;

class mainOP {
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        deck.fillList();
        Player playerOne = new Player("Katja", true);
        Player playerTwo = new Player("Florian", false);
        Player playerThree = new Player("Moritz", false);
    }
}