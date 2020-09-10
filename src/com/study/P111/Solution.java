package com.study.P111;

/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 首先可以想到使用深度优先搜索的方法，遍历整棵树，记录最小深度。
 * 对于每一个非叶子节点，我们只需要分别计算其左右子树的最小叶子节点深度。这样就将一个大问题转化为了小问题，可以递归地解决该问题。
 */
public class Solution {
    public int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if(root.left != null){
            min_depth = Math.min(minDepth(root.left),min_depth);
        }
        if(root.right != null){
            min_depth = Math.min(minDepth(root.right),min_depth);
        }
        return min_depth +1;

    }

}
