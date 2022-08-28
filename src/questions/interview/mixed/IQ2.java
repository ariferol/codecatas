/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions.interview.mixed;

/**
 *
 * @author aerol
 */
/**
 * Q: Given an integer array nums, return the length of the longest strictly
 * increasing subsequence. A subsequence is a sequence that can be derived from
 * an array by deleting some or no elements without changing the order of the
 * remaining elements. For example, [3,6,2,7] is a subsequence of the array
 * [0,3,1,6,2,2,7]. Example 1: Input: nums = [10,9,2,5,3,7,101,18] Output: 4
 * Explanation: The longest increasing subsequence is [2,3,7,101], therefore the
 * length is 4.
 */
public class IQ2 {

    public static int lengthOfLIS(int[] nums) {
        int[] lis = new int[nums.length];
        lis[0] = 1;
        for (int i = 1; i < lis.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, lis[j]);
                }
            }
            lis[i] = max + 1;
        }
        int len = 0;
        for (int val : lis) {
            len = Math.max(val, len);
        }
        return len;
    }

    public static void main(String[] args) {
//        int[] nums = {0,1,0,3,2,3};
        int[] nums = {7, 7, 7, 7, 7, 7};

        System.out.println(lengthOfLIS(nums));

    }
}
