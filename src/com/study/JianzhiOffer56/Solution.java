package com.study.JianzhiOffer56;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
 * 思路：通过两个Set存放重复的
 */
class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();
        for (int i = 0;i<nums.length;i++){
            if (firstSet.contains(nums[i])){
                if (secondSet.contains(nums[i])){
                    firstSet.remove(nums[i]);
                    secondSet.remove(nums[i]);
                }else {
                    secondSet.add(nums[i]);
                }
            }else{
                firstSet.add(nums[i]);
            }
        }
        int result = 0;
        for (int k:firstSet){
            result = k;
        }
        return result;
    }
}
