package hwr.oop;

public class Card {
    private String name;  // Name der Karte
    private int countValue;  // Wert der Karte fürs Auszählen
    private int battleValue; // Stichwert der Karte
    private boolean trump = false;  // Trumpf oder nicht
    private String color;  // Farbe der Karte

    public Card(String pName, int pCountValue, int pBattleValue, String pColor)//Konstruktor
    {
        this.name = pName;
        this.countValue = pCountValue;
        this.battleValue = pBattleValue;
        this.color = pColor;
    }
    public int getBattleValue() {
        return battleValue;
    }
    public int getCountValue() {
        return countValue;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
}
