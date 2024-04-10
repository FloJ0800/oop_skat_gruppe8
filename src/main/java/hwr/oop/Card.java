package hwr.oop;

public class Card {
    private int number; //Wird der Stich-wert
    private int value;  //Wert der Karte für den Zähler
    private int houseValue;
    public enum house
    {
        Kreuz,
        Pik,
        Herz,
        Karo
    }
    public enum cardValue {
        Ace,
        King,
        Queen,
        Jack,
        NumberCard
    }

    public Card(cardValue pValue)//Construktor wenn die Karte: Bube/Dame/König/Ass
    {
        checkCard(pValue);
    }

    public Card(cardValue pValue, int pNumber)//Construktor
    {
        this.number = pNumber;
        checkCard(pValue);

    }

    public int getValue()
    {
        return value;
    }

    public int getStrength()
    {
        return number;
    }

    private void checkCard(cardValue pCheck)//Hier wird der Wert der Karte überprüft
    {
        switch (pCheck)
        {
            case Ace:
                this.number = 14;
                this.value = 11;
                break;
            case King:
                this.number = 13;
                this.value = 4;
                break;
            case Queen:
                this.number = 12;
                this.value = 3;
                break;
            case Jack:
                this.number = 11;
                this.value = 2;
                break;
            default:
                break;
        }
    }
}
