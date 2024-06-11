package hwr.oop.skat;
import org.junit.jupiter.api.Test;
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
        Card noTrumpCardTwo_HERZ = new Card(Symbol.NEUN, Color.HERZ);


        Card trumpAndTrump = testComparator.getHighestTrick(trumpCardOne, trumpCardTwo);
        Card trumpAndTrumpReversed = testComparator.getHighestTrick(trumpCardTwo, trumpCardOne);
        Card noTrumpAndNoTrump = testComparator.getHighestTrick(noTrumpCardOne, noTrumpCardTwo);
        Card noTrumpAndNoTrumpOtherWay = testComparator.getHighestTrick(noTrumpCardTwo, noTrumpCardOne);
        Card noTrumpAndTrump = testComparator.getHighestTrick(noTrumpCardOne, trumpCardOne);
        Card trumpAndNoTrump = testComparator.getHighestTrick(trumpCardOne, noTrumpCardTwo);
        Card differentColor = testComparator.getHighestTrick(noTrumpCardTwo, noTrumpCardTwo_HERZ);

        assertSoftly(softly -> {
            softly.assertThat(trumpAndTrump).isEqualTo(trumpCardTwo);
            softly.assertThat(trumpAndTrumpReversed).isEqualTo(trumpCardTwo);
            softly.assertThat(noTrumpAndNoTrump).isEqualTo(noTrumpCardTwo);
            softly.assertThat(noTrumpAndTrump).isEqualTo(trumpCardOne);
            softly.assertThat(trumpAndNoTrump).isEqualTo(trumpCardOne);
            softly.assertThat(differentColor).isEqualTo(noTrumpCardTwo);
            softly.assertThat(noTrumpAndNoTrumpOtherWay).isEqualTo(noTrumpCardTwo);

        });
    }
}
