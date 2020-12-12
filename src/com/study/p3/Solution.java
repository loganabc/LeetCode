package com.study.p3;

/**
 * 无重复字符的最长子串
 * 思路：用一个长度为128的数组来表示字符是否出现过
 */
public class Solution {
    public int lengthOfLongestSubstring (String s) {
        // write code here
        int[] user = new int[128];
        int left = 0;
        int right = 0;
        int result = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            char temp = s.charAt(i);
            if(user[temp] == 0){
                //字符没有出现过
                user[temp] = 1;
                result = result + 1;
                res = res>result?res:result;
            }else{
                //字符出现过
                for(int j=left;j<s.length();j++){
                    if(temp == s.charAt(j)){
                        left = j+1;
                        break;
                    }else{
                        result = result - 1;
                        user[s.charAt(j)] = 0;
                    }
                }
            }
        }
        return res;
    }
}
