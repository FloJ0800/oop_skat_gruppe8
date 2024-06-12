package hwr.oop.skat;

import java.io.IOException;

public class Comparator {
  public Card getHighestTrick(Card CardA, Card CardB) {

    if (CardA.isTrump() && CardB.isTrump()) {
      if (Integer.compare(CardA.getBattleValue(), CardB.getBattleValue()) > 0) {
        return CardA;
      }
      else if(Integer.compare(CardA.getBattleValue(), CardB.getBattleValue()) < 0) {
        return CardB;
      }
    }
    else if (!CardA.isTrump() && CardB.isTrump()) {
      return CardB;

    }
    else if (CardA.isTrump() && !CardB.isTrump()) {
      return CardA;

    }
    else if (!CardA.isTrump() && !CardB.isTrump()) {

      if (CardA.getColor() != CardB.getColor()) {
        return CardA;

      }
      else if (CardA.getColor() == CardB.getColor()){
        if (Integer.compare(CardA.getBattleValue(), CardB.getBattleValue()) > 0) {
          return CardA;
        }
        else if (Integer.compare(CardA.getBattleValue(), CardB.getBattleValue()) < 0){
          return CardB;
        }
      }
    }
    return CardA;
  }

}
