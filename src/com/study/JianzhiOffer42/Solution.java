package com.study.JianzhiOffer42;

/**
 * 连续子数组的最大和
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 *
 * 要求时间复杂度为O(n)。
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int maxToCurrent = nums[0];
        int sum = nums[0];
        for (int i = 1;i<nums.length;i++){
            maxToCurrent = Math.max(maxToCurrent+nums[i],nums[i]);
            sum = Math.max(sum, maxToCurrent);
        }
        return sum;
    }
}
