package com.techcrack;


import java.util.*;

class PriorityQueueDemo {
    public static void main(String[] args) {
//        Queue<Integer> queue=new ArrayDeque<>();
//
//        queue.offer(12);
//        queue.offer(1);
//        queue.offer(3);
//        queue.offer(63);
//
//        System.out.println(queue);
//
//        Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
//
//        pq.offer(1);
//        pq.offer(56);
//        pq.offer(0);
//        pq.offer(43);
//
//        System.out.println(pq);
//
//        System.out.println(pq.poll());
//
//        System.out.println(pq);
//
//
//        System.out.println(pq.poll());
//
//        System.out.println(pq);
        Queue<Student> students=new PriorityQueue<>();

        students.offer(new Student("Kavin",20,8.52));
        students.offer(new Student("Dharani",21,8.02));
        students.offer(new Student("Ram",19,9.00));


        System.out.println(students.poll());
        System.out.println(students);
    }
}
