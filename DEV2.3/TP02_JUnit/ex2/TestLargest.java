import static org.junit.Assert.assertEquals;
import org.junit.Test;
 
public class TestLargest {
 
  @Test
  public void testSimple() {
    assertEquals(12, Largest.largest(new int[] {9,8,7,12}));
  }
}
