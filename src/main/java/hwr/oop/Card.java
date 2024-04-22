package hwr.oop;

public class Card {
    private String name;
    private int countValue;  //Wert der Karte für den Zähler
    private int battleValue; // Stichwert
    private boolean trump = false;
    private String color;

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
