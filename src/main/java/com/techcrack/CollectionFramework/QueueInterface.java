package com.techcrack.CollectionFramework;

import java.util.*;

/*
   * Class is used to perform the operations of queue
   * using various implementations
   * LinkedList
   * PriorityQueue
   * ArrayDeque
 */
public class QueueInterface {

    //Driver mode for performing the operations
    public static void main(String[] args){
        //Queue<Integer> queue = new LinkedList<>();

        PriorityQueue<Integer> queue = new PriorityQueue<>();


        queue.offer(12);
        queue.offer(13);
        queue.offer(14);

        System.out.println(queue);

        System.out.println("Is Empty : " + queue.isEmpty());

        System.out.println(queue.peek());

        System.out.println("Size : " + queue.size());

        queue.remove();

        System.out.println(queue);

        for(int k = 0; k < queue.size(); k++){
            System.out.println("Size : " + queue.size() + " " + queue.poll());
        }

        System.out.println(queue);
    }
}
