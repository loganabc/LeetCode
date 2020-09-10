package com.study.P19;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 思路：
 * 起始状态slow和fast都指向head，然后将fast向后移动n次，这样当fast到达末尾时，slow的下一个节点就是要移除的节点
 * 当然fast有可能为null，此时是要移除头节点
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode slow = head;
        ListNode fast = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        if(fast ==null){
            return head.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
