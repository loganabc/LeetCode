package com.study.P637;

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

    }

}
