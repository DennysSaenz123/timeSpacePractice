import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
  void testMostCommonTimeEfficientWithThreeDifferentNumbers() {
    int[] nums = {1, 1, 1, 2, 3, 3, 3, 3};
    int mostCommon = Practice.mostCommonTimeEfficient(nums);
    assertEquals(3, mostCommon);
  }

  @Test
  void testMostCommonTimeEfficientWithEmptyArray() {
    int[] nums = {};
    int mostCommon = Practice.mostCommonTimeEfficient(nums);
    assertEquals(0, mostCommon);
  }

    @Test
  public void testReturnFreqNumSpaceEfficient() {
    //arrange
    int[] nums = {2,3,2,1,2};
    int expected = 2;

    //act
    int actual = Practice.mostCommonSpaceEfficient(nums);

    //assert
    assertEquals(expected, actual);
  }
}
