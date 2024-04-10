package hwr.oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

// TODO Delete this placeholder test.
class ExampleTest {

  @Test
  void testConstructorNumber()
  {
    Card card = new Card(10,10);
    int result = card.getName();
    int resultValue = card.getValue();
    Assertions.assertThat(resultValue).isEqualTo(10);
    Assertions.assertThat(result).isEqualTo(10);
  }

  /*
  @Test
  void get_IsTrue() {
    Example example = new Example();
    String result = example.get();
    Assertions.assertThat(result).startsWith("Hello").endsWith("World!");
  }*/
}
