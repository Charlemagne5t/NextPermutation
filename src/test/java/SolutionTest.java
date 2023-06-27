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

    @Test
    public void nextPermutationTest4() {
        int[] nums = {1, 3, 2};
        int[] expected = {2, 1, 3};
        new Solution().nextPermutation(nums);

        Assert.assertArrayEquals(expected, nums);
    }

    @Test
    public void nextPermutationTest5() {
        int[] nums = {1, 3, 5, 4, 2};
        int[] expected = {1, 4, 2, 3, 5};
        new Solution().nextPermutation(nums);

        Assert.assertArrayEquals(expected, nums);
    }
}
