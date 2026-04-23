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
  @Test
    public void testMostCommonSpaceEfficient1() {
        // Arrange
        int[] nums = {1, 1, 3, 3, 3, 3, 4};
        int expected = 1;

        // Act
        int actual = Practice.mostCommonSpaceEfficient(nums);

        // Assert
        assertEquals(expected, actual);
    }

  @Test
  public void testMostCommonSpaceEfficient2() {
      // Arrange
      int[] nums = {5, 5, 5, 7, 7, 9};
      int expected = 5;

      // Act
      int actual = Practice.mostCommonSpaceEfficient(nums);

      // Assert
      assertEquals(expected, actual);
  }
}
