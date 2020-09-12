package com.study.P637;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Queue是一个接口，
 */
public class TestQueue {
    public static void main(String[] args) {
        //add()和remove()方法在失败时会抛出异常，不推荐使用
        Queue<String> queue = new LinkedList<String>();
        //添加元素
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        for (String q:queue){
            System.out.println(q);
        }
        //返回第一个元素，并在队列中删除
        System.out.println("poll = "+queue.poll());
        for (String q:queue){
            System.out.println(q);
        }
        //元素为null有可能会抛出异常
        System.out.println("element = "+queue.element());
        for (String q:queue){
            System.out.println(q);
        }
        //元素为null时不会抛出异常
        System.out.println("peek == "+queue.peek());
        for (String q:queue){
            System.out.println(q);
        }

    }
}
