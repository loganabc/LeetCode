package com.study.P628;

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
class Solution {
    public int maximumProduct(int[] nums) {
        int Top1 = Integer.MIN_VALUE;
        int Top2 = Integer.MIN_VALUE;
        int Top3 = Integer.MIN_VALUE;
        int Min1 = Integer.MAX_VALUE;
        int Min2 = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>Top1){
                Top3=Top2;
                Top2 = Top1;
                Top1 = nums[i];

            }else if(nums[i]>Top2){
                Top3 = Top2;
                Top2 = nums[i];

            }else if(nums[i]>Top3){
                Top3 = nums[i];
            }
            if(nums[i]<Min1){
                Min2=Min1;
                Min1=nums[i];

            }else if(nums[i]<Min2){
                Min2 = nums[i];
            }
        }
        return Math.max(Top1*Top2*Top3,Min1*Min2*Top1);

    }


}
