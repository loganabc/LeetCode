package com.study.P79;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 * 思路：
 * 设函数check(i,j,k) 判断以网格的(i,j) 位置出发，能否搜索到单词 \text{word}[k..]word[k..]，其中 \text{word}[k..]word[k..] 表示字符串 \text{word}word 从第 kk 个字符开始的后缀子串。如果能搜索到，则返回 \text{true}true，反之返回 \text{false}false。函数 \text{check}(i, j, k)check(i,j,k) 的执行步骤如下：
 *
 * 如果board[i][j]!=s[k]，当前字符不匹配，直接返回false。
 * 如果当前已经访问到字符串的末尾，且对应字符依然匹配，此时直接返回true。
 * 否则，遍历当前位置的所有相邻位置。如果从某个相邻位置出发，能够搜索到子串word[k+1..]，则返回true，否则返回false。
 * 这样，我们对每一个位置(i,j) 都调用函数check(i,j,0) 进行检查：只要有一处返回true，就说明网格中能够找到相应的单词，否则说明不能找到。
 *
 * 为了防止重复遍历相同的位置，需要额外维护一个与board 等大的visited 数组，用于标识每个位置是否被访问过。每次遍历相邻位置时，需要跳过已经被访问的位置。
 *
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        int h = board.length;
        int w = board[0].length;
        boolean[][] visited = new boolean[h][w];
        for (int i = 0;i<h;i++){
            for (int j=0;j<w;j++){
                boolean flag = check(board,visited,i,j,word,0);
                if (flag){
                    return true;
                }
            }
        }
        return false;

    }

    public boolean check(char[][] board,boolean[][]visited,int i,int j,String s, int k){
        if(board[i][j] != s.charAt(k)){
            return false;
        }else if(k == s.length() - 1){
            return true;
        }
        visited[i][j] = true;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};
        boolean result = false;
        for (int[] dir:directions){
            int newi = i + dir[0];
            int newj = j + dir[1];
            if(newi>=0&&newi<board.length&&newj>=0&&newj<board[0].length){
                if (!visited[newi][newj]){
                    boolean flag = check(board,visited,newi,newj,s,k+1);
                    if(flag){
                        result = true;
                        break;
                    }
                }
            }
        }
        visited[i][j] = false;
        return result;
    }
}
