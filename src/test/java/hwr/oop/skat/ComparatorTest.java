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


        int trumpAndTrump = testComparator.getHighestTrick(trumpCardOne, trumpCardTwo);
        int noTrumpAndNoTrump = testComparator.getHighestTrick(noTrumpCardOne, noTrumpCardTwo);
        int noTrumpAndTrump = testComparator.getHighestTrick(noTrumpCardOne, trumpCardOne);
        int trumpAndNoTrump = testComparator.getHighestTrick(trumpCardOne, noTrumpCardTwo);
        int differentColor = testComparator.getHighestTrick(noTrumpCardTwo, noTrumpCardTwo_HERZ);

        assertSoftly(softly -> {
            softly.assertThat(trumpAndTrump).isEqualTo(-1);
            softly.assertThat(noTrumpAndNoTrump).isEqualTo(-1);
            softly.assertThat(noTrumpAndTrump).isEqualTo(-1);
            softly.assertThat(trumpAndNoTrump).isEqualTo(1);
            softly.assertThat(differentColor).isEqualTo(1);

        });
    }
}
