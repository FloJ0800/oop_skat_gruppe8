package hwr;
import hwr.oop.skat.Comparator;
import hwr.oop.skat.Symbol;
import hwr.oop.skat.Card;
import hwr.oop.skat.Color;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;


public class ComparatorTest {
   
    @Test
    void gethighestTricktest(){
        Comparator testComparator = new Comparator();
        Card trumpCardOne = new Card(Symbol.SIEBEN, Color.KREUZ);
        Card trumpCardTwo = new Card(Symbol.NEUN, Color.KREUZ);
        trumpCardOne.setTrump(true);
        trumpCardTwo.setTrump(true);
        Card noTrumpCardOne = new Card(Symbol.SIEBEN, Color.PIK);
        Card noTrumpCardTwo = new Card(Symbol.NEUN, Color.PIK);

        int trumpAndTrump = testComparator.getHighestTrick(trumpCardOne, trumpCardTwo);
        int noTrumpAndNoTrump = testComparator.getHighestTrick(noTrumpCardOne, noTrumpCardTwo);
        int noTrumpAndTrump = testComparator.getHighestTrick(noTrumpCardOne, trumpCardOne);
        int trumpAndNoTrump = testComparator.getHighestTrick(trumpCardOne, noTrumpCardTwo);

        assertSoftly(softly -> {
            softly.assertThat(trumpAndTrump).isEqualTo(-1);
            softly.assertThat(noTrumpAndNoTrump).isEqualTo(-1);
            softly.assertThat(noTrumpAndTrump).isEqualTo(-1);
            softly.assertThat(trumpAndNoTrump).isEqualTo(1);

        });
    }
}
