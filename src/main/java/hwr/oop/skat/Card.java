package hwr.oop.skat;

public class Card {
    private Symbol symbol;  // Name der Karte
    private int countValue;  // Wert der Karte fürs Auszählen
    private int battleValue; // Stichwert der Karte
    private boolean trump = false;  // Trumpf oder nicht
    private Color color;  // Farbe der Karte

    public Card(Symbol pSymbol, Color pColor)//Konstruktor
    {
        this.symbol = pSymbol;
        this.countValue = symbol.getCountValue();
        this.battleValue = symbol.ordinal();
        this.color = pColor;
    }

    @Override
    public String toString() {
        return "Card{" +
                "symbol=" + symbol +
                ", countValue=" + countValue +
                ", battleValue=" + battleValue +
                ", trump=" + trump +
                ", color=" + color +
                '}';
    }

    public String printCard() {
        return color + " " + symbol;
    }

    public int getBattleValue() {
        return battleValue;
    }

    public int getCountValue() {
        return countValue;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public Color getColor() {
        return color;
    }
    public boolean isTrump()
    {
        return trump;
    }
    public void setTrump(boolean trumpState)
    {
        trump = trumpState;
    }

}
