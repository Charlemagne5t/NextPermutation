import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void nextPermutationTest1() {
        int[] nums = {1, 2, 3};
        int[] expected = {1, 3, 2};
        new Solution().nextPermutation(nums);

        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void nextPermutationTest2() {
        int[] nums = {3, 2, 1};
        int[] expected = {1, 2, 3};
        new Solution().nextPermutation(nums);

        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void nextPermutationTest3() {
        int[] nums = {1, 1, 5};
        int[] expected = {1, 5, 1};
        new Solution().nextPermutation(nums);

        Assert.assertArrayEquals(expected, nums);
    }
}
