package com.study.P637;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 * 思路：
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> list = new LinkedList<>();
        list.add(root);
        while(list.size()!=0){
            int len = list.size();
            double sum = 0;
            for(int i=0;i<len;i++){
                TreeNode node = list.poll();
                sum += node.val;
                if(node.left!=null)list.add(node.left);
                if(node.right!= null)list.add(node.right);
            }
            res.add(sum/len);
        }
        return res;

    }
}
