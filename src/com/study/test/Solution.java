package com.study.test;

/**
 * 最大子串和
 */
public class Solution {
    public static void main(String[] args) {
        int[] array = {-2,1,-3,4,-1,2,1,-5,4};
        int maxToCurrent = array[0];
        int sum = array[0];
        for (int i = 1; i<array.length;i++){
            maxToCurrent = Math.max(maxToCurrent+array[i],array[i]);
            sum = Math.max(sum,maxToCurrent);
        }
        System.out.println(sum);
    }
}
