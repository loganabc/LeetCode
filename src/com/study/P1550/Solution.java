package com.study.P1550;

/**
 * 给你一个整数数组 arr，请你判断数组中是否存在连续三个元素都是奇数的情况：如果存在，请返回 true ；否则，返回 false 。
 */
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=2;i<arr.length;i++){
            if(isOdd(arr[i])&isOdd(arr[i-1])&isOdd(arr[i-2])){
                return true;
            }
        }
        return false;

    }

    public boolean isOdd(int num){
        return num % 2 == 1;
    }
}
