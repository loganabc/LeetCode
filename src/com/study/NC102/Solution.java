package com.study.NC102;

/**
 * 给定一棵二叉树以及这棵树上的两个节点 o1 和 o2，请找到 o1 和 o2 的最近公共祖先节点。
 */
public class Solution {
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if(root == null) return -1;
        if(o1 == root.val||o2 == root.val) return root.val;
        int left = lowestCommonAncestor(root.left,o1,o2);
        int right = lowestCommonAncestor(root.right,o1,o2);
        if(left == -1) return right;
        if(right == -1) return left;
        return root.val;
    }
}
