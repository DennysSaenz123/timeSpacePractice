import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PracticeTest {
  
  // TODO: Implement tests for Practice.mostCommonTimeEfficient and Practice.mostCommonSpaceEfficient

  // Hints: They are static methods, so you will use the full Practice.mostCommonTimeEfficient for method calls

  @Test
  void testMostCommonTimeEfficientWithThreeDifferentNumbers() {
    Practice timeEfficient = new Practice();
    int[] nums = {1, 1, 1, 2, 3, 3, 3, 3};
    int mostCommon = timeEfficient.mostCommonTimeEfficient(nums);
    assertEquals(3, mostCommon);
  }
}
