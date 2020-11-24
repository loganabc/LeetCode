package com.study.P55;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 求二叉树的深度
 * 二叉树的深度有递归写法和非递归写法
 *
 *
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        //链表
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);//根节点进入链表
        int n = 0;
        while(!q.isEmpty()){//当链表非空时
            int size = q.size();
            for (int i = 0;i<size;i++){
                TreeNode x = q.poll();//把根节点拿出来
                if(x.left != null){
                    q.offer(x.left);//左节点进入
                }
                if(x.right != null){
                    q.offer(x.right);//右节点进入
                }
            }
            n++;
        }
        return n;
    }
}
