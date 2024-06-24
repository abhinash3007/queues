package QUEUE;

import java.util.*;

public class ImplementQueueUsingStack {
    public static class Queue {
        Stack<Integer> s = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public void add(int data) {
            s.push(data);
        }

        public void remove() {
            if (s.isEmpty() && s2.isEmpty()) {
                System.out.println("empty");
                return;
            }
            //if (s2.isEmpty()) {
                while (!s.isEmpty()) {
                    s2.push(s.pop());
                }
            //}
            System.out.println(s2.pop());
        }

        public void peek() {
            if (s.isEmpty() && s2.isEmpty()) {
                System.out.println("empty");
                return;
            }
            //if (s2.isEmpty()) {
                while (!s.isEmpty()) {
                    s2.push(s.pop());
                //}
            }
            System.out.println(s2.peek());
        }
    }public static void main(String[] args) {
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.remove();
        q.peek();
        q.remove();
        q.peek();
        q.remove();
        q.peek();

    }
}