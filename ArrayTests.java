import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;


public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  } 

  @Test
  public void testInput()
  {
    int[] input1 = { 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3}, input1); 

  }

  @Test
  public void testAvgLowest()
  {
    double[] input1 = { 2,1,4 };
    assertEquals(3, ArrayExamples.averageWithoutLowest(input1), 0.1); 
  }

}
