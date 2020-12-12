package com.study.P11;

/**
 * 旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xuan-zhuan-shu-zu-de-zui-xiao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public int minArray(int[] numbers){
        int low = 0;
        int high = numbers.length-1;
        while(low<high){
            int pivot = low+(high-low)/2;
            if(numbers[pivot]<numbers[high]){
                high = pivot;
            }else if(numbers[pivot]>numbers[high]){
                low = pivot+1;
            }else{
                high = high -1;
            }
        }
        return numbers[low];
    }
}
