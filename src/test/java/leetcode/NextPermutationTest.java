package leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NextPermutationTest {

    @Test
    void case1() {
        int[] nums = {1, 2};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{2, 1}, nums);
    }

    @Test
    void case2() {
        int[] nums = {2, 1};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 2}, nums);
    }

    @Test
    void case3() {
        int[] nums = {1, 3, 2};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{2, 1, 3}, nums);
    }

    @Test
    void case4() {
        int[] nums = {1, 2, 3};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 3, 2}, nums);
    }

    @Test
    void case5() {
        int[] nums = {3, 2, 1};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, nums);
    }

    @Test
    void case6() {
        int[] nums = {1, 1, 5};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{1, 5, 1}, nums);
    }

    @Test
    void case7() {
        int[] nums = {2, 3, 1};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{3, 1, 2}, nums);
    }

    @Test
    void case8() {
        int[] nums = {1, 5, 1};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{5, 1, 1}, nums);
    }

    @Test
    void case9() {
        int[] nums = {5,4,7,5,3,2};
        NextPermutation.nextPermutation(nums);
        Assertions.assertArrayEquals(new int[]{5,5,2,3,4,7}, nums);
    }
}