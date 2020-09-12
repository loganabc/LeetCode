package com.study.P867;

/**
 * 给定一个矩阵 A， 返回 A 的转置矩阵。
 *
 * 矩阵的转置是指将矩阵的主对角线翻转，交换矩阵的行索引与列索引。
 */

class Solution {
    public int[][] transpose(int[][] A) {
        int A_hang = A.length;
        int A_lie = A[0].length;
        int[][] B = new int[A_lie][A_hang];
        for(int i = 0;i<A_lie;i++){
            for(int j = 0;j<A_hang;j++){
                B[i][j] = A[j][i];
            }
        }
        return B;
    }
}
