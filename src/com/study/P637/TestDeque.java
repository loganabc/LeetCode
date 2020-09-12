package com.study.P637;

import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 双向队列
 *
 */
public class TestDeque {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<String>();
        //在队列尾部插入数据
        //offer = offerLast
        deque.offer("a");
        deque.offer("b");
        deque.offer("c");
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("==========");
        //在队列尾部插入数据
        deque.offerLast("d");
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("==========");
        //在队列头部插入数据
        deque.offerFirst("0");
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("===检查元素===");
        //检查元素
        //peek = peekFirst
        System.out.println("peek = "+deque.peek());
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("peekLast = "+deque.peekLast());
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("peekFirst = "+deque.peekFirst());
        for(String q:deque){
            System.out.println(q);
        }

        System.out.println("===删除元素===");
        //poll = pollFirst
        System.out.println("poll = "+ deque.poll());
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("pollLast = "+deque.pollLast());
        for (String q:deque){
            System.out.println(q);
        }
        System.out.println("pollFirst = "+deque.pollFirst());
        for (String q:deque){
            System.out.println(q);
        }

    }

}
