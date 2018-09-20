package leetcode;

import java.util.Arrays;

/*
 * [31] Next Permutation
 *
 * https://leetcode.com/problems/next-permutation/description/
 *
 * algorithms
 * Medium (29.26%)
 * Total Accepted:    174.6K
 * Total Submissions: 596.8K
 * Testcase Example:  '[1,2,3]'
 *
 * Implement next permutation, which rearranges numbers into the
 * lexicographically next greater permutation of numbers.
 *
 * If such arrangement is not possible, it must rearrange it as the lowest
 * possible order (ie, sorted in ascending order).
 *
 * The replacement must be in-place and use only constant extra memory.
 *
 * Here are some examples. Inputs are in the left-hand column and its
 * corresponding outputs are in the right-hand column.
 *
 * 1,2,3 → 1,3,2
 * 3,2,1 → 1,2,3
 * 1,1,5 → 1,5,1
 *
 */

class NextPermutation {
    static void nextPermutation(int[] nums) {
        int swap1 = nums.length - 2;
        while (swap1 >= 0 && nums[swap1] >= nums[swap1 + 1]) swap1--;

        if (swap1 != -1) {
            int swap2 = nums.length - 1;
            while (nums[swap2] <= nums[swap1]) swap2--;
            int temp = nums[swap2];
            nums[swap2] = nums[swap1];
            nums[swap1] = temp;
            Arrays.sort(nums, swap1 + 1, nums.length);
        } else {
            int i = 0, j = nums.length - 1;
            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }
    }
}
