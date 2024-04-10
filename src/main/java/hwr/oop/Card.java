package hwr.oop;

public class Card {
    private int name; //Wird der Stich-wert
    private int value;  //Wert der Karte für den Zähler

    public Card(int pName, int pValue)//Construktor
    {
        this.name = pName;
        this.value = pValue;
    }

    public int getValue()
    {
        return value;
    }

    public int getName()
    {
        return name;
    }
}
