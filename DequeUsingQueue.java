package QUEUE;

import java.util.*;

public class DequeUsingQueue {
    public static class Queue{
        Deque<Integer>d=new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }public void remove(){
            System.out.println(d.removeFirst());
        }public void peek(){
            System.out.println(d.getFirst());
        }
    }public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.peek();
        q.remove();
        q.peek();
    }
}
