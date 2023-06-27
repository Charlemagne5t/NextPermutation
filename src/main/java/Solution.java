import java.util.Arrays;

public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n != 1) {
            int index1 = -1;
            for (int i = n - 1; i > 0; i--) {
                if (nums[i - 1] < nums[i]) {
                    index1 = i - 1;
                    break;
                }
            }

            if (index1 == -1) {
                Arrays.sort(nums);
            } else {
                int index2 = -1;
                for (int i = n - 1; i > index1; i--) {
                    if (nums[i] > nums[index1]) {
                        index2 = i;
                        break;
                    }
                }

                int temp = nums[index1];
                nums[index1] = nums[index2];
                nums[index2] = temp;
                int[] tempArray = new int[n - index1 - 1];
                for (int i = index1 + 1, j = 0; i < n; i++, j++) {
                    tempArray[j] = nums[i];
                }

                for (int i = n - 1, j = 0; i > index1; i--, j++) {
                    nums[i] = tempArray[j];
                }
            }


        }
    }
}
