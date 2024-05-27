package hwr.oop.skat;
import hwr.oop.skat.Card;

public class Comparator {
    

    public static int getHighestTrick(Card CardA, Card CardB){

        if (CardA.isTrump() && CardB.isTrump()){

            return Integer.compare(CardA.getBattleValue(), CardB.getBattleValue());

        } else if (!CardA.isTrump() && CardB.isTrump()){

            return -1;

        } else if (CardA.isTrump() && !CardB.isTrump()){

            return 1;

        } else {

            if (CardA.getColor() != CardB.getColor()){

                return 1;

            } else {

                return Integer.compare(CardA.getBattleValue(), CardB.getBattleValue());

            }

        }

    }

}
