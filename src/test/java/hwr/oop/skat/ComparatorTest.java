package hwr.oop.skat;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.SoftAssertions.assertSoftly;


class ComparatorTest {
   
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

        int trumpAndTrumpReverse = testComparator.getHighestTrick(trumpCardTwo, trumpCardOne);
        int noTrumpAndNoTrumpReverse = testComparator.getHighestTrick(noTrumpCardTwo, noTrumpCardOne);
        int noTrumpAndTrumpReverse = testComparator.getHighestTrick(trumpCardOne, noTrumpCardOne);
        int trumpAndNoTrumpReverse = testComparator.getHighestTrick(noTrumpCardOne, trumpCardTwo);


        assertSoftly(softly -> {
            softly.assertThat(trumpAndTrump).isEqualTo(-1);
            softly.assertThat(noTrumpAndNoTrump).isEqualTo(-1);
            softly.assertThat(noTrumpAndTrump).isEqualTo(-1);
            softly.assertThat(trumpAndNoTrump).isEqualTo(1);

            softly.assertThat(trumpAndTrumpReverse).isEqualTo(1);
            softly.assertThat(noTrumpAndNoTrumpReverse).isEqualTo(1);
            softly.assertThat(noTrumpAndTrumpReverse).isEqualTo(1);
            softly.assertThat(trumpAndNoTrumpReverse).isEqualTo(-1);

        });
    }
}
