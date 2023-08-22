import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void twoSumTest() {
        int[] arr = new int[]{2,7,11,15};
        int[] ans = solution.twoSum(arr, 9);
        Assertions.assertEquals(ans[0], 0);
        Assertions.assertEquals(ans[1], 1);
    }

    @Test
    public void twoSumTest1() {
        int[] arr = new int[]{3,2,4};
        int[] ans = solution.twoSum(arr, 6);
        Assertions.assertEquals(ans[0], 1);
        Assertions.assertEquals(ans[1], 2);
    }

    @Test
    public void twoSumTest2() {
        int[] arr = new int[]{3,3};
        int[] ans = solution.twoSum(arr, 6);
        Assertions.assertEquals(ans[0], 0);
        Assertions.assertEquals(ans[1], 1);
    }

    @Test
    public void twoSumTest3() {
        int[] arr = new int[]{1, 6, 9, 31};
        int[] ans = solution.twoSum(arr, 40);
        Assertions.assertEquals(ans[0], 2);
        Assertions.assertEquals(ans[1], 3);
    }
}
